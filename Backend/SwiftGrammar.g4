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
: declavarible (PUNTOCOMA)? { $inst = $declavarible.decvbl}
| declaconstante (PUNTOCOMA)? { $inst = $declaconstante.deccon}
| asignacionvariable (PUNTOCOMA)? { $inst = $asignacionvariable.asgvbl}
| sentenciaifelse { $inst = $sentenciaifelse.myIfElse}
| switchcontrol { $inst = $switchcontrol.mySwitch}
| whilecontrol { $inst = $whilecontrol.whict}
| forcontrol { $inst = $forcontrol.forct}
| guardcontrol { $inst = $guardcontrol.guct}
| vectorcontrol (PUNTOCOMA)? { $inst = $vectorcontrol.vect }
| vectoragregar  { $inst = $vectoragregar.veadct }
| vectorremover  { $inst = $vectorremover.vermct }
| printstmt (PUNTOCOMA)? { $inst = $printstmt.prnt}
| matrizcontrol (PUNTOCOMA)? { $inst = $matrizcontrol.matct}
| matrizasignacion (PUNTOCOMA)? { $inst = $matrizasignacion.matasig}
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
: declavarible (PUNTOCOMA)? { $insint = $declavarible.decvbl}
| declaconstante (PUNTOCOMA)? { $insint = $declaconstante.deccon}
| asignacionvariable (PUNTOCOMA)? { $insint = $asignacionvariable.asgvbl}
| sentenciaifelse { $insint = $sentenciaifelse.myIfElse}
| switchcontrol { $insint = $switchcontrol.mySwitch}
| whilecontrol { $insint = $whilecontrol.whict}
| forcontrol { $insint = $forcontrol.forct}
| guardcontrol { $insint = $guardcontrol.guct}
| continuee (PUNTOCOMA)? { $insint = $continuee.coct}
| breakk (PUNTOCOMA)? { $insint = $breakk.brkct}
| retornos (PUNTOCOMA)? { $insint = $retornos.rect }
| vectorcontrol (PUNTOCOMA)? { $insint = $vectorcontrol.vect }
| vectoragregar  (PUNTOCOMA)? { $insint = $vectoragregar.veadct }
| vectorremover (PUNTOCOMA)? { $insint = $vectorremover.vermct }
| printstmt (PUNTOCOMA)? { $insint = $printstmt.prnt}
| matrizasignacion (PUNTOCOMA)? { $insint = $matrizasignacion.matasig}
;

/////////////////////////
/////////////////////////
///     GENERALES     ///
/////////////////////////
/////////////////////////

// DECLARACION DE VARIABLES
declavarible returns [interfaces.Instruction decvbl]
: VAR ID_VALIDO DOS_PUNTOS tipodato IG expr{$decvbl = instructions.NewVariableDeclaration($VAR.line, $VAR.pos, $ID_VALIDO.text, $tipodato.tipo, $expr.e)}
| VAR ID_VALIDO IG expr {$decvbl = instructions.NewVariableDeclaracionSinTipo($VAR.line, $VAR.pos, $ID_VALIDO.text, $expr.e)}
| VAR ID_VALIDO DOS_PUNTOS tipodato CIERRE_INTE {$decvbl = instructions.NewVariableDeclaracionSinExp($VAR.line, $VAR.pos, $ID_VALIDO.text, $tipodato.tipo)};

// DECLARACION DE CONSTANTES
declaconstante returns [interfaces.Instruction deccon]
: LET ID_VALIDO DOS_PUNTOS tipodato IG expr {$deccon = instructions.NewConstanteDeclaration($LET.line, $LET.pos, $ID_VALIDO.text, $tipodato.tipo, $expr.e)}
| LET ID_VALIDO IG expr {$deccon = instructions.NewConstanteDeclaracionSinTipo($LET.line, $LET.pos, $ID_VALIDO.text, $expr.e)};

// ASIGNACION DE VARIABLES
asignacionvariable returns [interfaces.Instruction asgvbl]
: ID_VALIDO IG expr { $asgvbl = instructions.NewAsignacionVariable($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)}
| ID_VALIDO SUMA expr { $asgvbl = instructions.NewAsignacionSuma($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)}
| ID_VALIDO RESTA expr { $asgvbl = instructions.NewAsignacionResta($ID_VALIDO.line, $ID_VALIDO.pos, $ID_VALIDO.text, $expr.e)};

// TIPOS DE DATOS
tipodato returns [environment.TipoExpresion tipo]
: INT { $tipo = environment.INTEGER }
| FLOAT { $tipo = environment.FLOAT }
| STRING { $tipo = environment.STRING }
| BOOL { $tipo = environment.BOOLEAN }
| CHARACT { $tipo = environment.CHARACTER };

// EXPRESION
expr returns [interfaces.Expression e]
: op=NOT right=expr { $e = expressions.NewOperation($right.start.GetLine(), $right.start.GetColumn(), $right.e, $op.text, $right.e) }
| left=expr op=MODULO right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MUL|DIV) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| PARIZQ expr PARDER { $e = $expr.e }
| SUB NUMBER                             
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
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,-num3,environment.FLOAT)
        }else{
            num,err := strconv.Atoi($NUMBER.text)
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,-num,environment.INTEGER)
        }
    }
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
| vectorvacio { $e = $vectorvacio.veemct}
| vectorcount { $e = $vectorcount.vecnct}
| vectoraccess { $e = $vectoraccess.vepposct}
| intembebida { $e = $intembebida.intemb}
| floatembebida { $e = $floatembebida.floemb}
| stringembebida { $e = $stringembebida.stremb}
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

//CREACION DEL FOR
forcontrol returns [interfaces.Instruction forct]
: FOR ID_VALIDO IN left=expr RANGO right=expr LLAVEIZQ blockinterno LLAVEDER { $forct = instructions.NewSentenciaForRango($FOR.line, $FOR.pos, $ID_VALIDO.text, $left.e, $right.e,$blockinterno.blkint)}
| FOR ID_VALIDO IN expr LLAVEIZQ blockinterno LLAVEDER { $forct = instructions.NewSentenciaForCadena($FOR.line, $FOR.pos, $ID_VALIDO.text, $expr.e, $blockinterno.blkint)};
 
 //CREACION DE GUARD
guardcontrol returns [interfaces.Instruction guct]
:GUARD expr ELSE LLAVEIZQ blockinterno LLAVEDER  
{ 
    $guct = instructions.NewSentenciaGuard($GUARD.line, $GUARD.pos, $expr.e, $blockinterno.blkint)
};

//CREACION DEL CONTINUE
continuee returns [interfaces.Instruction coct]
: CONTINUE {$coct = instructions.NewTransferenciaContinue($CONTINUE.line, $CONTINUE.pos)};

//CREACION DEL BREAK
breakk returns [interfaces.Instruction brkct]
: BREAK { $brkct = instructions.NewTransferenciaBreak($BREAK.line, $BREAK.pos)};

//CREACION DEL RETURN
retornos returns [interfaces.Instruction rect]
: RETURN
{
    $rect = instructions.NewTransferenciaReturn($RETURN.line, $RETURN.pos);
}
| RETURN op=expr
{
    $rect = instructions.NewTransferenciaReturnExp($RETURN.line, $RETURN.pos, $op.e);
};


//CREACION DEL VECTOR (pendiente)
vectorcontrol returns [interfaces.Instruction vect]
: VAR ID_VALIDO DOS_PUNTOS CORCHIZQ tipodato CORCHDER IG CORCHIZQ blockparams CORCHDER { $vect = instructions.NewArregloDeclaracionLista($VAR.line ,$VAR.pos, $ID_VALIDO.text , $tipodato.tipo, $blockparams.blkpar)}
| VAR ID_VALIDO DOS_PUNTOS CORCHIZQ tipodato CORCHDER IG CORCHIZQ CORCHDER { $vect = instructions.NewArregloDeclaracionSinLista($VAR.line ,$VAR.pos, $ID_VALIDO.text , $tipodato.tipo)}
| VAR prin=ID_VALIDO DOS_PUNTOS CORCHIZQ tipodato CORCHDER IG secu=ID_VALIDO { $vect = instructions.NewArregloDeclaracionId($VAR.line ,$VAR.pos, $prin.text , $tipodato.tipo, $secu.text)};

blockparams returns [[]interface{} blkpar]
@init{
    $blkpar = []interface{}{}
    var listInt []IBloqueparamsContext
}
: blopas+=bloqueparams+
{
    listInt = localctx.(*BlockparamsContext).GetBlopas()
    for _, e := range listInt {
        $blkpar = append($blkpar, e.GetBlopas())
    }
}
;

bloqueparams returns [interfaces.Expression blopas]
: COMA expr 
{
    $blopas = instructions.NewArregloParametros($COMA.line ,$COMA.pos, $expr.e)
}
| expr 
{
    $blopas = instructions.NewArregloParametro($expr.e)
};

vectoragregar returns [interfaces.Instruction veadct]
: ID_VALIDO PUNTO APPEND PARIZQ expr PARDER { $veadct = instructions.NewArregloAppend($ID_VALIDO.text , $expr.e)}
| prin=ID_VALIDO CORCHIZQ pop=expr CORCHDER IG secu=ID_VALIDO CORCHIZQ sop=expr CORCHDER { $veadct = instructions.NewArregloAppendArreglo($prin.text , $pop.e, $secu.text, $sop.e)}
| ID_VALIDO CORCHIZQ pop=expr CORCHDER IG sop=expr { $veadct = instructions.NewArregloAppendExp($ID_VALIDO.text , $pop.e, $sop.e)};

vectorremover returns [interfaces.Instruction vermct]
: ID_VALIDO PUNTO REMOVELAST PARIZQ PARDER  { $vermct = instructions.NewArregloRemoveLast($PUNTO.line, $PUNTO.pos, $ID_VALIDO.text)}
| ID_VALIDO PUNTO REMOVE PARIZQ AT DOS_PUNTOS expr PARDER { $vermct = instructions.NewArregloRemovePos($PUNTO.line, $PUNTO.pos, $ID_VALIDO.text, $expr.e)};

vectorvacio returns [interfaces.Expression veemct]
: ID_VALIDO PUNTO ISEMPTY { $veemct = instructions.NewArregloIsEmpty($PUNTO.line, $PUNTO.pos, $ID_VALIDO.text)};

vectorcount returns [interfaces.Expression vecnct]
: ID_VALIDO PUNTO COUNT { $vecnct = instructions.NewArregloCount($PUNTO.line, $PUNTO.pos, $ID_VALIDO.text)};

vectoraccess returns [interfaces.Expression vepposct]
: ID_VALIDO CORCHIZQ op1=expr CORCHDER CORCHIZQ op2=expr CORCHDER listamatrizaddsubs
{ $vepposct = instructions.NewMatrizObtencionList($ID_VALIDO.text, $op1.e, $op2.e, $listamatrizaddsubs.blklimatas) }
| ID_VALIDO CORCHIZQ op1=expr CORCHDER CORCHIZQ op2=expr CORCHDER 
{ $vepposct = instructions.NewMatrizObtencion($ID_VALIDO.text, $op1.e, $op2.e) } 
|ID_VALIDO CORCHIZQ expr CORCHDER { $vepposct = instructions.NewArregloAccess($CORCHDER.line, $CORCHDER.pos, $ID_VALIDO.text, $expr.e)};

//CREACION DE MATRICES
matrizcontrol returns [interfaces.Instruction matct]
: VAR ID_VALIDO (DOS_PUNTOS tipomatriz)? IG defmatriz
{
    if ($DOS_PUNTOS != nil) {
        $matct = instructions.NewMatrizDeclaracion($VAR.line, $VAR.pos, $ID_VALIDO.text ,$tipomatriz.tipomat, $defmatriz.defmat)
    } else {
        $matct = instructions.NewMatrizDeclaracionSinTipo($VAR.line, $VAR.pos, $ID_VALIDO.text , $defmatriz.defmat)
    }
}
;

tipomatriz returns [interfaces.Expression tipomat]
: CORCHIZQ tipomatriz CORCHDER 
{ 
    $tipomat = instructions.NewMatrizDimension($CORCHIZQ.line, $CORCHIZQ.pos, $tipomatriz.tipomat)
}
| CORCHIZQ tipodato CORCHDER 
{ 
    $tipomat = instructions.NewMatrizTipo($CORCHIZQ.line, $CORCHIZQ.pos, $tipodato.tipo)
}
;

defmatriz returns [interfaces.Instruction defmat]
: listavaloresmat { $defmat = $listavaloresmat.listvlamat}
;

listavaloresmat returns [interfaces.Instruction listvlamat]
: CORCHIZQ listavaloresmat2 CORCHDER { $listvlamat = $listavaloresmat2.mylisttmatt}
| simplematriz { $listvlamat = $simplematriz.simmat}
;

listavaloresmat2 returns [interfaces.Instruction mylisttmatt]
: op=listavaloresmat2 COMA listavaloresmat { $mylisttmatt = instructions.NewMatrizListaExpresionList($op.mylisttmatt, $listavaloresmat.listvlamat)}
| listavaloresmat { $mylisttmatt = instructions.NewMatrizListaNivel($listavaloresmat.listvlamat)}
| listaexpresions { $mylisttmatt = instructions.NewMatrizListaExpresion($listaexpresions.blkparf)}
;

listaexpresions returns [[]interface{} blkparf]
@init{
    $blkparf = []interface{}{}
    var listInt []IListaexpresionContext
}
: funpar+=listaexpresion+
{
    listInt = localctx.(*ListaexpresionsContext).GetFunpar()
    for _, e := range listInt {
        $blkparf = append($blkparf, e.GetFunpar())
    }
}
;

listaexpresion returns [interfaces.Expression funpar]
: COMA expr 
{
    $funpar = instructions.NewArregloParametros($COMA.line ,$COMA.pos, $expr.e)
}
| expr 
{
    $funpar = instructions.NewArregloParametro($expr.e)
}
;

simplematriz returns [interfaces.Instruction simmat]
: tipomatriz PARIZQ REPEATING DOS_PUNTOS op=simplematriz COMA COUNT DOS_PUNTOS NUMBER PARDER 
{ $simmat = instructions.NewMatrizSimpleUno($tipomatriz.tipomat, $op.simmat, $NUMBER.text, $NUMBER.line,$NUMBER.pos)}
| tipomatriz PARIZQ REPEATING DOS_PUNTOS expr COMA COUNT DOS_PUNTOS NUMBER PARDER 
{ $simmat = instructions.NewMatrizSimpleDos($tipomatriz.tipomat, $expr.e, $NUMBER.text, $NUMBER.line,$NUMBER.pos)}
;

matrizasignacion returns [interfaces.Instruction matasig]
: ID_VALIDO CORCHIZQ expr CORCHDER listamatrizaddsubs IG expr 
{ $matasig = instructions.NewMatrizAsiginacion($ID_VALIDO.text, $expr.e, $listamatrizaddsubs.blklimatas) }
;

listamatrizaddsubs returns [[]interface{} blklimatas]
@init{
    $blklimatas = []interface{}{}
    var listInt []IListamatrizaddsubContext
}
: lmas+=listamatrizaddsub+
{
    listInt = localctx.(*ListamatrizaddsubsContext).GetLmas()
    for _, e := range listInt {
        $blklimatas = append($blklimatas, e.GetLmas())
    }
}
;

listamatrizaddsub returns [interfaces.Expression lmas]
: CORCHIZQ expr CORCHDER 
{
    $lmas = instructions.NewArregloParametros($CORCHIZQ.line ,$CORCHIZQ.pos, $expr.e)
}
;

/*
//CREACION DEL STRUCT

structcontrol:
	STRUCT ID_VALIDO LLAVEIZQ (listaatributos)* LLAVEDER {};

listaatributos: (LET | VAR) ID_VALIDO (DOS_PUNTOS tipodato)? (
		IG expresion
	)? PUNTOCOMA {}
	| MUTATING CIERRE_INTE {};


*/

//CREACION DE FUNCIONES
funciondeclaracioncontrol
: FUNCION ID_VALIDO PARIZQ listaparametros? PARDER RETORNO tipodato LLAVEIZQ blockinterno LLAVEDER {}
| FUNCION ID_VALIDO PARIZQ listaparametros? PARDER LLAVEIZQ blockinterno LLAVEDER {};

listaparametros:
	COMA (ID_VALIDO | GUIONBAJO)? ID_VALIDO DOS_PUNTOS INOUT? tipodato listaparametros {}
	| (ID_VALIDO | GUIONBAJO)? ID_VALIDO DOS_PUNTOS INOUT? tipodato {};

funcionllamadacontrol:
	ID_VALIDO PARIZQ listaparametrosllamada? PARIZQ {};

listaparametrosllamada:
	COMA (ID_VALIDO DOS_PUNTOS)? ('&')? expr listaparametrosllamada {}
	| (ID_VALIDO DOS_PUNTOS)? ('&')? expr {};

//CREACION DE EMBEBIDAS

// FUNCION PRINT

// FUNCION PRINT
printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)};

intembebida returns [interfaces.Expression intemb]
: INT PARIZQ expr PARDER { $intemb = instructions.NewFuncionIntEmbebida($expr.e)};

floatembebida returns [interfaces.Expression floemb]
: FLOAT PARIZQ expr PARDER { $floemb = instructions.NewFuncionFloatEmbebida($expr.e)};

stringembebida returns [interfaces.Expression stremb]
: STRING PARIZQ expr PARDER { $stremb = instructions.NewFuncionStringEmbebida($expr.e)};