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
    LPAREN : '(';
    RPAREN : ')';
    POUND : '£';
    CONTEXTSEP : '->';

ruleset : ( filterset )+ EOF;
	// What we should end up with is an executable table by resource
	// of filters to be executed.
	// When we run through the table we bind the context to the
	// unbound "{VARIABLES}" and then run through and execute.

filterset: RPATH CONTEXTSEP ( filter )+
	{ 
		{
			//System.out.println("-->filterset <" + $RPATH.text + ">"); 
			RegisterSingleton.getRegisters().getResourceVars().put($RPATH.text, new String("TO BE RESOLVED AGAINST JSON INBOUND DOC"));
			//System.out.println("--->resource count: " + RegisterSingleton.getRegisters().getResourceVars().size());
		}
		// What we want to add to this is a list of filter expressions
	}
;

filter: (ALLOW | DENY) expression ';';

expression : or_expression;

or_expression : and_expression (OR and_expression)*;

and_expression : term (AND term)*;

term : atom (operator atom)? | LPAREN expression RPAREN;

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
PATH : ( ID (PATHSEP PATH)* );									// This is not picking up the simple case of an ID.
SPATH : ( ID SPATHSEP ID (SPATHSEP ID)* );
RPATH : ( ID RPATHSEP ID (RPATHSEP ID)* );
VAR : '{' PATH '}';

SPACE :   [ \t]+ -> skip ;

