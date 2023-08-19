grammar SwiftGrammar;

options {
	tokenVocab = SwiftLexer;
}

@header {
    import "Backend/interfaces"
    import "Backend/environment"
    import "Backend/expressions"
    import "Backend/instructions"
    import "strings"
}

s returns [[]interface{} code]
: block EOF
    {   
        $code = $block.blk
    }
;

block returns [[]interface{} blk]
@init{
    $blk = []interface{}{}
    var listInt []IInstructionContext
  }
: ins+=instruction+
    {
        listInt = localctx.(*BlockContext).GetIns()
        for _, e := range listInt {
            $blk = append($blk, e.GetInst())
        }
    }
;

// LISTA DE INSTRUCCIONES GENERALES O GLOBALES
instruction returns [interfaces.Instruction inst]
: printstmt (PUNTOCOMA)? { $inst = $printstmt.prnt}
| declavarible (PUNTOCOMA)? { $inst = $declavarible.decvbl}
| declaconstante (PUNTOCOMA)? { $inst = $declaconstante.deccon}
| asignacionvariable (PUNTOCOMA)? { $inst = $asignacionvariable.asgvbl}
| sentenciaifelse { $inst = $sentenciaifelse.myIfElse}
| switchcontrol { $inst = $switchcontrol.mySwitch}
| whilecontrol { $inst = $whilecontrol.whict}
;

// LISTA DE INSTRUCCIONES LOCALES
blockinterno returns [[]interface{} blkint]
@init{
    $blkint = []interface{}{}
    var listInt []IInstructionintContext
  }
: insint+=instructionint+
    {
        listInt = localctx.(*BlockinternoContext).GetInsint()
        for _, e := range listInt {
            $blkint = append($blkint, e.GetInsint())
        }
    }
;


// LISTA DE INSTRUCCIONES LOCALES
instructionint returns [interfaces.Instruction insint]
: printstmtint (PUNTOCOMA)? { $insint = $printstmtint.prnt}
| declavaribleint (PUNTOCOMA)? { $insint = $declavaribleint.decvbl}
| declaconstanteint (PUNTOCOMA)? { $insint = $declaconstanteint.deccon}
| asignacionvariableint (PUNTOCOMA)? { $insint = $asignacionvariableint.asgvbl}
| sentenciaifelse { $insint = $sentenciaifelse.myIfElse}
| switchcontrol { $insint = $switchcontrol.mySwitch}
| whilecontrol { $insint = $whilecontrol.whict}
;

/////////////////////////
/////////////////////////
///     GENERALES     ///
/////////////////////////
/////////////////////////

// FUNCION PRINT
printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}
;

// DECLARACION DE VARIABLES
declavarible returns [interfaces.Instruction decvbl]
: VAR ID_VALIDO DOS_PUNTOS tipodato IG expr{$decvbl = instructions.NewVariableDeclaration($VAR.line, $VAR.pos, $ID_VALIDO.text, "Global",$tipodato.tipo, $expr.e)}
| VAR ID_VALIDO IG expr {$decvbl = instructions.NewVariableDeclaracionSinTipo($VAR.line, $VAR.pos, $ID_VALIDO.text, "Global", $expr.e)}
| VAR ID_VALIDO DOS_PUNTOS tipodato CIERRE_INTE {$decvbl = instructions.NewVariableDeclaracionSinExp($VAR.line, $VAR.pos, $ID_VALIDO.text, "Global", $tipodato.tipo)};

// DECLARACION DE CONSTANTES
declaconstante returns [interfaces.Instruction deccon]
: LET ID_VALIDO DOS_PUNTOS tipodato IG expr {$deccon = instructions.NewConstanteDeclaration($LET.line, $LET.pos, $ID_VALIDO.text, "Global", $tipodato.tipo, $expr.e)}
| LET ID_VALIDO IG expr {$deccon = instructions.NewConstanteDeclaracionSinTipo($LET.line, $LET.pos, $ID_VALIDO.text, "Global", $expr.e)};

// ASIGNACION DE VARIABLES
asignacionvariable returns [interfaces.Instruction asgvbl]
: ID_VALIDO IG expr { $asgvbl = instructions.NewAsignacionVariable($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)}
| ID_VALIDO SUMA expr { $asgvbl = instructions.NewAsignacionSuma($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)}
| ID_VALIDO RESTA expr { $asgvbl = instructions.NewAsignacionResta($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)};

/////////////////////////
/////////////////////////
///     LOCALES       ///
/////////////////////////
/////////////////////////

// FUNCION PRINT
printstmtint returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}
;

// DECLARACION DE VARIABLES
declavaribleint returns [interfaces.Instruction decvbl]
: VAR ID_VALIDO DOS_PUNTOS tipodato IG expr{$decvbl = instructions.NewVariableDeclaration($VAR.line, $VAR.pos, $ID_VALIDO.text, "Local",$tipodato.tipo, $expr.e)}
| VAR ID_VALIDO IG expr {$decvbl = instructions.NewVariableDeclaracionSinTipo($VAR.line, $VAR.pos, $ID_VALIDO.text, "Local", $expr.e)}
| VAR ID_VALIDO DOS_PUNTOS tipodato CIERRE_INTE {$decvbl = instructions.NewVariableDeclaracionSinExp($VAR.line, $VAR.pos, $ID_VALIDO.text, "Local", $tipodato.tipo)};

// DECLARACION DE CONSTANTES
declaconstanteint returns [interfaces.Instruction deccon]
: LET ID_VALIDO DOS_PUNTOS tipodato IG expr {$deccon = instructions.NewConstanteDeclaration($LET.line, $LET.pos, $ID_VALIDO.text, "Local", $tipodato.tipo, $expr.e)}
| LET ID_VALIDO IG expr {$deccon = instructions.NewConstanteDeclaracionSinTipo($LET.line, $LET.pos, $ID_VALIDO.text, "Local", $expr.e)};

// ASIGNACION DE VARIABLES
asignacionvariableint returns [interfaces.Instruction asgvbl]
: ID_VALIDO IG expr { $asgvbl = instructions.NewAsignacionVariable($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)}
| ID_VALIDO SUMA expr { $asgvbl = instructions.NewAsignacionSuma($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)}
| ID_VALIDO RESTA expr { $asgvbl = instructions.NewAsignacionResta($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)};


// TIPOS DE DATOS
tipodato returns [environment.TipoExpresion tipo]
: INT { $tipo = environment.INTEGER }
| FLOAT { $tipo = environment.FLOAT }
| STRING { $tipo = environment.STRING }
| BOOL { $tipo = environment.BOOLEAN }
| CHARACT { $tipo = environment.CHARACTER }
;

// EXPRESION
expr returns [interfaces.Expression e]
: op=NOT right=expr { $e = expressions.NewOperation($right.start.GetLine(), $right.start.GetColumn(), $right.e, $op.text, $right.e) }
| left=expr op=(MUL|DIV) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=MODULO right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| PARIZQ expr PARDER { $e = $expr.e }
| NUMBER                             
    {
        if (strings.Contains($NUMBER.text,".")){
            num,err := strconv.ParseFloat($NUMBER.text, 64);
            if err!= nil{
                fmt.Println(err)
            }
	        num2 := fmt.Sprintf("%.6f", num)
            num3,err := strconv.ParseFloat(num2, 64);
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num3,environment.FLOAT)
        }else{
            num,err := strconv.Atoi($NUMBER.text)
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)
        }
    }
| CADENA
    {
        str := $CADENA.text
        $e = expressions.NewPrimitive($CADENA.line, $CADENA.pos, str[1:len(str)-1],environment.STRING)
    }                        
| TRU { $e = expressions.NewPrimitive($TRU.line, $TRU.pos, true, environment.BOOLEAN) }
| FAL { $e = expressions.NewPrimitive($FAL.line, $FAL.pos, false, environment.BOOLEAN) }
| CHARACTER 
    { 
        str := $CHARACTER.text
        $e = expressions.NewPrimitive($CHARACTER.line, $CHARACTER.pos, str[1:len(str)-1], environment.CHARACTER) 
    }
|ID_VALIDO
    {
        id := $ID_VALIDO.text
        $e = instructions.NewCallid($ID_VALIDO.line,$ID_VALIDO.pos,id)
    }
|NULO {$e = expressions.NewPrimitive($NULO.line, $NULO.pos, $NULO.text,environment.NULL)}
;

// CREACION DE IF-ELSE
sentenciaifelse returns [interfaces.Instruction myIfElse]
: IF expr LLAVEIZQ blockinterno LLAVEDER { $myIfElse = instructions.NewSentenciaIf($IF.line, $IF.pos, $expr.e, $blockinterno.blkint)}
| IF expr LLAVEIZQ ifop=blockinterno LLAVEDER ELSE LLAVEIZQ elseop=blockinterno LLAVEDER { $myIfElse = instructions.NewSentenciaIfElse($IF.line, $IF.pos, $expr.e, $ifop.blkint , $elseop.blkint)}
| IF expr LLAVEIZQ blockinterno LLAVEDER ELSE sentenciaifelse { $myIfElse = instructions.NewSentenciaIfElseIf($IF.line, $IF.pos, $expr.e, $blockinterno.blkint, $sentenciaifelse.myIfElse)};

// CREACION DEL SWITCH
switchcontrol returns [interfaces.Instruction mySwitch]
: SWITCH expr LLAVEIZQ blockcase (DEFAULT DOS_PUNTOS blockinterno)? LLAVEDER 
{
    if ($DEFAULT != nil) {
        $mySwitch = instructions.NewSentenciaSwitchDefault($SWITCH.line, $SWITCH.pos, $expr.e, $blockcase.blkcase, $blockinterno.blkint)
    } else {
        $mySwitch = instructions.NewSentenciaSwitch($SWITCH.line, $SWITCH.pos, $expr.e, $blockcase.blkcase)
    }
};

blockcase returns [[]interface{} blkcase]
@init{
    $blkcase = []interface{}{}
    var listInt []IBloquecaseContext
}
: blocas+=bloquecase+
{
    listInt = localctx.(*BlockcaseContext).GetBlocas()
    for _, e := range listInt {
        $blkcase = append($blkcase, e.GetBlocas())
    }
}
;

bloquecase returns [interfaces.Instruction blocas]
: CASE expr DOS_PUNTOS blockinterno 
{
    $blocas=instructions.NewSentenciaSwitchCase($CASE.line ,$CASE.pos, $expr.e, $blockinterno.blkint)
};

// CREACION DEL WHILE
whilecontrol returns [interfaces.Instruction whict]
: WHILE expr LLAVEIZQ blockinterno LLAVEDER { $whict = instructions.NewSentenciaWhile($WHILE.line, $WHILE.pos, $expr.e, $blockinterno.blkint)};