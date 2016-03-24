
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class TescoPredicateParser 
{
	
	static public String tests[] = 	{
									"tesco/tps/Contract: ALLOW Price > £500.00; DENY Price < £10000.00;",
									"tesco/tps/Company: DENY CompanyNumber != {MyProfile/MyCompanyNumber};"
	};
								
    public static void main( String[] args) throws Exception 
    {
    	for (int i=0; (i < tests.length); i++)
    	{
    		System.out.println("tests[i] is <" + tests[i] + ">");
    		StringBufferInputStream stream = new StringBufferInputStream(tests[i]);
    		ANTLRInputStream input = new ANTLRInputStream(stream);

    		TescoFilterGrammarLexer lexer = new TescoFilterGrammarLexer(input);

    		CommonTokenStream tokens = new CommonTokenStream(lexer);

    		TescoFilterGrammarParser parser = new TescoFilterGrammarParser(tokens);
    		ParseTree tree = parser.filter(); // begin parsing at rule 'filter'
    		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    	}
    }
}