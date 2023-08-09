grammar SwiftGrammar; 
import SwiftLexer; 

inicio
    : (sentenciascontrol)+ EOF;

// LISTA DE TODAS LAS SENTENCIAS QUE SE PUEDAN EJECUTAR EN EL ARCHIVO
sentenciascontrol
    : declavariable (PUNTOCOMA)?
    | declaconstante (PUNTOCOMA)?
    | asignacionvariable (PUNTOCOMA)?
    | ifelsecontrol
    | swtichcontrol
    | whilecontrol
    | forcontrol
    | guardcontrol
    | printcontrol
    | funciondeclaracioncontrol
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
    | ID_VALIDO SUMA
    | ID_VALIDO RESTA
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
    : expresion AND expresion 
    | expresion OR expresion
    | expresion MAYOR expresion
    | expresion MENOR expresion
    | expresion MAY_IG expresion
    | expresion MEN_IG expresion
    | expresion IG_IG expresion
    | expresion DIF expresion
    | expresion ADD expresion
    | expresion SUB expresion
    | expresion DIV expresion
    | expresion MUL expresion
    | expresion MODULO expresion
    | PARIZQ expresion PARDER
    | SUB expresion
    | NOT expresion
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
    ;

// CREACION DE IF-ELSE
ifelsecontrol
    : IF expresion LLAVEIZQ (listainstrucciones)* LLAVEDER
    | IF expresion LLAVEIZQ (listainstrucciones)* LLAVEDER ELSE LLAVEIZQ (listainstrucciones)* LLAVEDER 
    | IF expresion LLAVEIZQ (listainstrucciones)* LLAVEDER ELSE ifelsecontrol
    ;

// CREACION DEL SWITCH
swtichcontrol
    : SWITCH expresion LLAVEIZQ caselist (defecto)? LLAVEDER
    ;

caselist
    : caselist casecontrol
    | casecontrol
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
    : GUARD expresion ELSE LLAVEIZQ (listainstrucciones)* (CONTINUE|BREAK|retorno) LLAVEDER
    ;

//CREACION DEL RETURN
retorno
    : RETURN (expresion)? 
    ;

//CREACION DEL VECTOR (pendiente)
vectorontrol
    : VAR ID_VALIDO DOS_PUNTOS tipodato definicionvector
    ;

definicionvector
    : LLAVEIZQ tipodato LLAVEDER
    | PARIZQ PARDER
    | ID_VALIDO
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