//
// Antlr grammar for Tesco tps filtering
//

grammar TescoFilterGrammar;

    ALLOW : 'ALLOW';
    DENY : 'DENY';
    TRUE : 'true';
    FALSE : 'false';
    AND : 'and';
    OR : 'or';
    NOT : '!';
    LT : '<';
    LE : '<=';
    GT : '>';
    GE : '>=';
    EQ : '=';
    PATHSEP : '/';
    LBRACK : '[';
    RBRACK : ']';
    LPAREN : '(';
    RPAREN : ')';
    POUND : '£';

ruleset : ( filterset )+ EOF;

filterset: PATH ':' ( filter )+;

filter: (ALLOW | DENY) expression ';';

expression : or_expression;

or_expression : and_expression (OR and_expression)*;

and_expression : term (AND term)*;

term : atom (operator atom)? | LPAREN expression RPAREN;

atom : VAR | PATH | INT | FLOAT | STRING | TRUE | FALSE;

operator : LT | LE | GT | GE | EQ | NOT;

INT : '0'..'9'+;
FLOAT : ('0'..'9')+ '.' ('0'..'9')*;
CURRENCY : POUND FLOAT;
STRING : '"' ('a'..'z'|'A'..'Z'|'_'|' ')* '"';
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
VAR : '{' PATH '}';
PATH : (ID | ID PATHSEP PATH)+;

