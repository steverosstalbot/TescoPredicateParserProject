grammar JsonPath;

/*
 Limited set of JsonPath notation
 TODO
 - bracketnotation
 - Check against spec description (http://goessner.net/articles/JsonPath/), e.g. '..' for recursive descent
*/

jsonpath: dotnotation
        ;

dotnotation : '$.' dotnotation_expr ('.' dotnotation_expr)*;

dotnotation_expr : identifierWithQualifier
                 | INDENTIFIER
                 ;

identifierWithQualifier : INDENTIFIER '[]'
                        | INDENTIFIER '[' INT ']'
                        | 'within' INDENTIFIER 'lookfor(' query_expr ')]'
                        ;

query_expr : query_expr ('and' query_expr)+
           | query_expr ('or' query_expr)+
           | '*'
           | '@.' INDENTIFIER
           | '@.' INDENTIFIER 'greater than' INT
           | '@.' INDENTIFIER 'less than' INT
           | '@.length-' INT
           | '@.' INDENTIFIER 'equals' INT
           | '@.' INDENTIFIER 'does not equal' INDENTIFIER '\''
           ;

INDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INT         : '0' | [1-9][0-9]* ;
WS  :   [ \t\n\r]+ -> skip ;

