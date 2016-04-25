//
// Antlr grammar for Tesco tps filtering 
//

grammar TescoFilterGrammar;

@header {
package org.tesco.tps.predicategrammar;
import java.util.HashMap;
import org.tesco.tps.filterhandler.RegisterSingleton;
}


@members {

}

	ALL : 'all';
	WITHIN : 'within';
	MATCH : 'matching';
    ALLOW : 'ALLOW';
    DENY : 'DENY';
    TRUE : 'true';
    FALSE : 'false';
    AND : 'and';
    OR : 'or';
    NOT : '!';
    NE : '!=';
    LT : '<';
    LE : '<=';
    GT : '>';
    GE : '>=';
    EQ : '==';
    PATHSEP : '.';
    SPATHSEP : '/';
    RPATHSEP : ':';
    LBRACK : '[';
    RBRACK : ']';
    QMARK : '?';
    AT : '@';
    LPAREN : '(';
    RPAREN : ')';
    POUND : '£';
    CONTEXTSEP : '->';

ruleset : ( filter )+ EOF;
	// What  we should end up  with is an executable table by resource
	// of filters to be executed. 
	// When we run through the   table we bind the context to the
	// unbound "{VARIABLES}" and  then run through and execute.

filter: (ALLOW | DENY) expression ';';

expression : or_expression;

or_expression : and_expression (OR and_expression)*;

and_expression : (term | qualifiedterm) (AND (term | qualifiedterm))*;

term : (NOT)? atom | atom (operator atom)? | LPAREN expression RPAREN;

qualifiedterm : WITHIN PATH MATCH term |
				ALL PATH;

atom : VAR 	{
				{ 
					//System.out.println("-->VAR");
					RegisterSingleton.getRegisters().getUserContextVars().put($VAR.text.substring(1,$VAR.text.length()-1), new String("TO BE BOUND FROM USER CONTEXT"));
					//System.out.println("--->" + $VAR.text);
					//System.out.println("--->usermemory count: " + RegisterSingleton.getRegisters().getUserContextVars().size());
				}
			}
		| PATH {
				{ 
					//System.out.println("-->ID");
					RegisterSingleton.getRegisters().getJSONVars().put($PATH.text, new String("TO BE BOUND TO THE INCOMING JSON DOC"));
					//System.out.println("--->" + $PATH.text);
					//System.out.println("--->jsonmemory count: " + RegisterSingleton.getRegisters().getJSONVars().size());
				}
			}
		
		| INT 
		| FLOAT 
		| STRING 
		| TRUE 
		| FALSE;

operator : LT | LE | GT | GE | EQ | NE | NOT;

INT : '0'..'9'+;
FLOAT : ('0'..'9')+ '.' ('0'..'9')*;
CURRENCY : POUND FLOAT;
STRING : '"' ('a'..'z'|'A'..'Z'|'_'|'-')* '"' |
		 '\'' ('a'..'z'|'A'..'Z'|'_'|'-')* '\'';
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
PATH :  ID ( '.' ID )*;									// This is not picking up the simple case of an ID.
SPATH : ( ID (SPATHSEP ID)* );
RPATH : ( ID (RPATHSEP ID)* );
VAR : '{' PATH '}';

SPACE :   [ \t]+ -> skip ;

