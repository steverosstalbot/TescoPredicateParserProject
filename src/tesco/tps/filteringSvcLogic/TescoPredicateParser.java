package tesco.tps.filteringSvcLogic;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.tesco.tps.predicategrammar.TescoFilterGrammarLexer;
import org.tesco.tps.predicategrammar.TescoFilterGrammarParser;

import java.io.*;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
//import org.tesco.util.predicategrammar.*;

public class TescoPredicateParser 
{
	//
	// The context for a filter is a document type within a domain.
	// For example "tesco:tps:Contract" specifies tesco as a domain
	// tps as a source and Contract as a document type.
	//
	
	static public String tests[] = 	{
									"tesco:tps:Contract -> ALLOW ContractDetails.Price > 500.00 and ContractDetails.Price < 10000; DENY ContractDetails.Price < 10000.00;",
									"tesco:tps:Company -> DENY CompanyDetails.CompanyNumber == {Company.CompanyNumber};",
									"tesco:tps:User -> ALLOW {User.lastName} == 'Ross-Talbot';",
									"tesco:tps:ProductHierary -> ALLOW ProductDetails.ProductCategory == {AutorizationCategory};"
	};
								
    public static void main( String[] args) throws Exception 
    {
    	UserContext uc = new UserContext(
    			"123", "stevert", "Steve", "Ross-Talbot", "Diary", "Buyer", "stalbot@thoughtworks.com",
    			"TW", "ThoughtWorks Ltd", "999"
    			);
    	
    	for (int i=0; (i < tests.length); i++)
    	{
    		System.out.println("tests[i] is <" + tests[i] + ">");
    		StringReader stream = new StringReader(tests[i]);
    		ANTLRInputStream input = new ANTLRInputStream(stream);

    		TescoFilterGrammarLexer lexer = new TescoFilterGrammarLexer(input);

    		CommonTokenStream tokens = new CommonTokenStream(lexer);

    		//
    		// Tidy this bit up so that we don't swap from Hash to keySet
    		//
    		TescoFilterGrammarParser parser = new TescoFilterGrammarParser(tokens);
    		ParseTree tree = parser.ruleset(); // begin parsing at rule 'ruleset'
    		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    		Set<String> userMemory = TescoFilterGrammarParser.usermemory.keySet();
    		System.out.println("Entries for user memory: " + TescoFilterGrammarParser.usermemory.size());
    		Iterator<String> iter;
    		int j = 0;
    		System.out.println("User Memory Dump:");
    		String memorycell = null;
    		Object obj = null;
    		for (iter = userMemory.iterator(); (iter.hasNext());)
    		{
    			memorycell = iter.next();
    			obj = bind(memorycell,uc);
    			TescoFilterGrammarParser.usermemory.replace(memorycell, obj);
    			System.out.println("[" + memorycell + "," + obj + "]");
    		}
    		System.out.println("**********");
    		Set<String> jsonMemory = TescoFilterGrammarParser.jsonmemory.keySet();
    		System.out.println("Entries for json memory: " + TescoFilterGrammarParser.jsonmemory.size());
    		j = 0;
    		System.out.println("Json Memory Dump:");
    		for (iter = jsonMemory.iterator(); (iter.hasNext());)
    			System.out.println("Json Memory Cell [" + (j++) + "] = " + iter.next());
    		System.out.println("**********");
    		    		
    		j=0;
    		System.out.println("Entries for resources: " + TescoFilterGrammarParser.resources.size());
    		System.out.println("Resource Dump:");
    		Set<String> resourceSet = TescoFilterGrammarParser.resources.keySet();

    		for (iter = resourceSet.iterator(); (iter.hasNext());)
    			System.out.println("Resource Cell [" + (j++) + "] = " + iter.next());
    		System.out.println("**********");

    	}
    }
    
    //
    // The toBind is always of the form x[.y]. The x is the class the y is the attribute in bean form.
    //
    static Object bind (String toBind, UserContext uc)
    {
    	//
    	// Company.CompanyName should xlate to a call 
    	// within uc of
    	//	uc.getCompany().getCompanyName()
    	//
    	// First find out if uc has getCompany().
    	// Then does it return something that is accessible through getCompanyName()
    	//
    	// If the first letter is lowercase then capitalise in each case.
    	//
    	Object obj = null;
    	int i = 0;
    	int j = 0;
    	String methodName = beanise(new String(toBind.substring(toBind.lastIndexOf(".")+1)));
    	
    	List<String> components = new ArrayList<String>();
    	String pathComponent = null;
		i = 0;
    	while (i >= 0)
    	{
    		j = toBind.indexOf(".",i);
    		if (j > 0)
    		{
    			pathComponent = beanise(new String(toBind.substring(i, j)));
    			components.add(pathComponent);
    			i = j+1;
    		} else {
    			pathComponent = beanise(new String(toBind.substring(toBind.lastIndexOf(".")+1)));
    			components.add(pathComponent);
    			i = j;
    		}
    	}
    	
		Class<?> c = uc.getClass();
		obj = uc;
    	for (i=0; (i < components.size()); i++)
    	{
    		java.lang.reflect.Method method;
    		try 
    		{
    			method = c.getMethod(components.get(i));
    			c = method.getReturnType();
        		try 
        		{
        		  	obj = method.invoke(obj);
        		  	if (i == components.size()-1)
        		  	{
        		  		return obj;
        		  	}
        		} 
        		catch (IllegalArgumentException e) 
        		{ // exception handling omitted for brevity
        			System.out.println("Illegal argument to method call " + method.getName() + " on class " + obj.getClass().getName());
        		} 
        		catch (IllegalAccessException e) 
        		{ // exception handling omitted for brevity
        	    		System.out.println("Illegal argument to method call " + method.getName() + " on class " + obj.getClass().getName());
        		} 
        		catch (Exception e)
        		{
        			e.printStackTrace();
        		}
    		} 
    		catch (SecurityException e) 
    		{
    			// exception handling omitted for brevity
    			System.out.println("No such method " + methodName + " is visible for class " +  c.getName());
    		} 
    		catch (NoSuchMethodException e) 
    		{
    			// exception handling omitted for brevity
    			System.out.println("No such method " + methodName + " exists for class " +  c.getName());
    		}
    	}
    	return obj;
    }
    
    public static String beanise(String in)
    {
    	String beanMethodName = new String("get" + in.substring(0, 1).toUpperCase() + in.substring(1));
    	return beanMethodName;
    }
}