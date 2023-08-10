grammar SwiftGrammar; 
import SwiftLexer; 

inicio
    : (sentenciascontrol)* EOF;

// LISTA DE TODAS LAS SENTENCIAS QUE SE PUEDAN EJECUTAR EN EL ARCHIVO
sentenciascontrol
    : ifelsecontrol
    | swtichcontrol
    | whilecontrol
    | forcontrol
    | guardcontrol
    | printcontrol
    | structcontrol
    | funciondeclaracioncontrol
    | declavariable (PUNTOCOMA)?
    | declaconstante (PUNTOCOMA)?
    | asignacionvariable (PUNTOCOMA)?
    | vectorcontrol (PUNTOCOMA)?
    | vectoragregar (PUNTOCOMA)?
    | vectorremover (PUNTOCOMA)?
    | matrizcontrol (PUNTOCOMA)?
    | matrizasignacion (PUNTOCOMA)?
    ;

listainstrucciones
    : declavariable (PUNTOCOMA)?
    | declaconstante (PUNTOCOMA)?
    | asignacionvariable (PUNTOCOMA)?
    | ifelsecontrol
    | swtichcontrol
    | whilecontrol
    | forcontrol
    | guardcontrol
    | CONTINUE (PUNTOCOMA)?
    | BREAK (PUNTOCOMA)?
    | retorno (PUNTOCOMA)?
    | printcontrol
    | intembebida
    | floatembebida
    | stringembebida
    | funcionllamadacontrol
    | vectorcontrol (PUNTOCOMA)?
    | vectoragregar (PUNTOCOMA)?
    | vectorremover (PUNTOCOMA)?
    | matrizcontrol (PUNTOCOMA)?
    | matrizasignacion (PUNTOCOMA)?
    ;

// DECLARACIÓN DE VARIABLES
declavariable
    : VAR ID_VALIDO DOS_PUNTOS tipodato IG expresion
    | VAR ID_VALIDO IG expresion
    | VAR ID_VALIDO DOS_PUNTOS tipodato CIERRE_INTE
    ;

// DECLARACION CONSTANTE
declaconstante
    : LET ID_VALIDO DOS_PUNTOS tipodato IG expresion
    | LET ID_VALIDO IG expresion
    ;

// ASIGNACION DE VARIABLES
asignacionvariable
    : ID_VALIDO IG expresion
    | ID_VALIDO SUMA expresion
    | ID_VALIDO RESTA expresion
    ;

tipodato
    : INT
    | FLOAT
    | STRING
    | BOOL 
    | CHARACT
    ;

// expresion GENERAL fragment
expresion
    : NOT expresion
    | left=expresion op=(DIV|MUL|MODULO) right=expresion
    | left=expresion op=(ADD|SUB) right=expresion
    | left=expresion op=(MAYOR| MENOR| MAY_IG|MEN_IG) right=expresion
    | left=expresion op=(IG_IG|DIF) right=expresion 
    | left=expresion op=AND right=expresion 
    | left=expresion op=OR right=expresion 
    | PARIZQ expresion PARDER    
    | SUB expresion
    | NUMBER
    | CADENA
    | TRU
    | FAL
    | CHARACTER
    | ID_VALIDO
    | NULO
    | intembebida
    | floatembebida
    | stringembebida
    | funcionllamadacontrol
    | vectorvacio
    | vectorcount
    | vectoraccess
    | matrizobtener
    ;

// CREACION DE IF-ELSE
ifelsecontrol
    : IF expresion LLAVEIZQ (listainstrucciones)* LLAVEDER
    | IF expresion LLAVEIZQ (listainstrucciones)* LLAVEDER ELSE LLAVEIZQ (listainstrucciones)* LLAVEDER 
    | IF expresion LLAVEIZQ (listainstrucciones)* LLAVEDER ELSE ifelsecontrol
    ;

// CREACION DEL SWITCH
swtichcontrol
    : SWITCH expresion LLAVEIZQ casecontrol+ (defecto)? LLAVEDER
    ;

casecontrol
    : CASE expresion DOS_PUNTOS (listainstrucciones)*
    ;

defecto
    : DEFAULT DOS_PUNTOS (listainstrucciones)*
    ;

// CREACION DEL WHILE
whilecontrol
    : WHILE expresion LLAVEIZQ (listainstrucciones)* LLAVEDER
    ;

//CREACION DEL FOR
forcontrol
    : FOR ID_VALIDO IN expresion LLAVEIZQ (listainstrucciones)* LLAVEDER
    | FOR ID_VALIDO IN expresion RANGO  expresion LLAVEIZQ (listainstrucciones)* LLAVEDER
    ;

//CREACION DE GUARD
guardcontrol
    : GUARD expresion ELSE LLAVEIZQ (listainstrucciones)* (CONTINUE|BREAK|retorno) (PUNTOCOMA)? LLAVEDER
    ;

//CREACION DEL RETURN
retorno
    : RETURN (expresion)? 
    ;

//CREACION DEL VECTOR (pendiente)
vectorcontrol
    : VAR ID_VALIDO DOS_PUNTOS CORCHIZQ tipodato CORCHDER definicionvector
    ;

definicionvector
    : IG CORCHIZQ listaexpresion CORCHDER
    | CORCHIZQ tipodato CORCHDER CORCHIZQ CORCHDER
    | PARIZQ PARDER
    | ID_VALIDO
    ;

listaexpresion
    : expresion (COMA listaexpresion)*
    ;

vectoragregar
    : ID_VALIDO PUNTO APPEND PARIZQ expresion PARDER
    | ID_VALIDO CORCHIZQ expresion CORCHDER IG ID_VALIDO CORCHIZQ expresion CORCHDER
    ;

vectorremover
    : ID_VALIDO PUNTO REMOVELAST PARIZQ PARDER
    | ID_VALIDO PUNTO REMOVE PARIZQ AT DOS_PUNTOS expresion PARDER
    ;
vectorvacio
    : ID_VALIDO PUNTO EMPTY
    ;

vectorcount
    :ID_VALIDO PUNTO COUNT
    ;

vectoraccess
    : ID_VALIDO CORCHIZQ expresion CORCHDER
    ;

//CREACION DE MATRICES
matrizcontrol
    : VAR ID_VALIDO ( DOS_PUNTOS tipomatriz)? IG defmatriz
    ;

tipomatriz
    : CORCHIZQ tipomatriz CORCHDER
    | CORCHIZQ tipodato CORCHDER
    ;

defmatriz
    : listavaloresmat
    | simplematriz
    ;

listavaloresmat
    : CORCHIZQ listavaloresmat2 CORCHDER
    ;

listavaloresmat2
    : listavaloresmat2 COMA listavaloresmat
    | listavaloresmat
    | listaexpresion
    ;

simplematriz
    : tipomatriz PARIZQ REPEATING DOS_PUNTOS simplematriz COMA COUNT DOS_PUNTOS NUMBER PARDER
    | tipomatriz PARIZQ REPEATING DOS_PUNTOS expresion COMA COUNT DOS_PUNTOS NUMBER PARDER
    ;

matrizasignacion
    : ID_VALIDO CORCHIZQ expresion CORCHDER CORCHIZQ expresion CORCHDER ( CORCHIZQ expresion CORCHDER )* IG expresion
    ;

matrizobtener
    :  ID_VALIDO CORCHIZQ expresion CORCHDER CORCHIZQ expresion CORCHDER ( CORCHIZQ expresion CORCHDER )*
    ;

//CREACION DE EMBEBIDAS
printcontrol
    :PRINT PARIZQ (expresion)? PARDER
    ;

intembebida
    : INT PARIZQ expresion PARDER
    ;

floatembebida
    : FLOAT PARIZQ expresion PARDER
    ;

stringembebida
    : STRING PARIZQ expresion PARDER
    ;

//CREACION DE FUNCIONES
funciondeclaracioncontrol
    : FUNCION ID_VALIDO PARIZQ listaparametros? PARDER RETORNO tipodato LLAVEIZQ (listainstrucciones)+ LLAVEDER
    | FUNCION ID_VALIDO PARIZQ listaparametros? PARDER LLAVEIZQ (listainstrucciones)+ LLAVEDER
    ;

listaparametros
    : COMA (ID_VALIDO | GUIONBAJO )? ID_VALIDO DOS_PUNTOS INOUT? tipodato listaparametros
    | (ID_VALIDO | GUIONBAJO )? ID_VALIDO DOS_PUNTOS INOUT? tipodato
    ;

funcionllamadacontrol
    :ID_VALIDO PARIZQ listaparametrosllamada? PARIZQ
    ;

listaparametrosllamada
    : COMA (ID_VALIDO DOS_PUNTOS )? ('&')? expresion listaparametrosllamada
    | (ID_VALIDO DOS_PUNTOS)? ('&')? expresion
    ;

structcontrol
    : STRUCT ID_VALIDO LLAVEIZQ (listaatributos)* LLAVEDER
    ;

listaatributos
    : (LET|VAR) ID_VALIDO ( DOS_PUNTOS tipodato)? (IG expresion)? PUNTOCOMA
    | MUTATING CIERRE_INTE declaracionfunciones
    ;
