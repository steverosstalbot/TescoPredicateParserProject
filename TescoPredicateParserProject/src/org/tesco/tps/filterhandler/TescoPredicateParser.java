package org.tesco.tps.filterhandler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.tesco.tps.UserContext.UserContext;
import org.tesco.tps.predicategrammar.TescoFilterGrammarLexer;
import org.tesco.tps.predicategrammar.TescoFilterGrammarParser;

import java.io.*;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

import com.fasterxml.jackson.core.json.*;

//import org.tesco.util.predicategrammar.*;

public class TescoPredicateParser 
{
	//
	// The context for a filter is a document type within a domain.
	// For example "tesco:tps:Contract" specifies tesco as a domain
	// tps as a source and Contract as a document type.
	//

	private String m_filters[] = 	{
									"tesco:tps:Contract -> ALLOW ContractDetails.Price > 500.00 and ContractDetails.Price < 10000;",
	};
	/*
									"tesco:tps:Company -> DENY CompanyDetails.CompanyNumber != {Company.CompanyNumber};"
									"tesco:tps:User -> ALLOW {User.lastName} == 'Ross-Talbot';",
									"tesco:tps:ProductHierary -> ALLOW ProductDetails.ProductCategory == {User.AutorizationCategory};"
	};
	*/
	
	private String 		m_inboundDoc = "INBOUND";
	private String 		m_outboundDoc = "OUTBOUND";
	private UserContext m_userContext = null;
	
	private Set<String> m_userMemory = null;
	private Set<String> m_jsonMemory = null;
	
	private TescoFilterGrammarParser	m_parser = null;
	
	
	
	public TescoPredicateParser()
	{
		setUserContext(new UserContext("123", "stevert", "Steve", "Ross-Talbot", "Cosmetics", "Buyer", "stalbot@thoughtworks.com",
    			"TW", "ThoughtWorks Ltd", "999"));
	}
	
	//
	// Standard bean accessor methods
	//
	public String[] getFilters() { return m_filters; }
	public UserContext getUserContext() { return m_userContext; }
	public String getInboundDoc() { return m_inboundDoc; }
	public String getOutboundDoc() { return m_outboundDoc; }
	public TescoFilterGrammarParser getParser() { return m_parser; }
	
	public void setParser(TescoFilterGrammarParser p)
	{
		m_parser = p;
	}
	public void setFilters(String[] f)
	{
		m_filters = f;
	}
	public void setUserContext(UserContext uc)
	{
		m_userContext = uc;
	}
	public void setInboundDoc(String ibd)
	{
		m_inboundDoc = ibd;
	}
	public void setOutboundDoc(String obd)
	{
		m_outboundDoc = obd;
	}
	
	//
	// Basic main with a test or two
	//
    public static void main( String[] args) throws Exception 
    {
    	System.out.println("START");
    	TescoPredicateParser parseExpression = new TescoPredicateParser();
    	parseExpression.filter(parseExpression.getUserContext(), parseExpression.getInboundDoc(), parseExpression.getFilters());
    	parseExpression.setOutboundDoc(parseExpression.filter(parseExpression.getUserContext(), parseExpression.getInboundDoc(), parseExpression.getFilters()));
    	System.out.println("END");
    }
    
    //
    // This represents what would be the exported service function for the filter micro service
    // It parses each filter in turn, binds and at some point will evaluate.
    //
    public String filter(UserContext uc, String inboundDoc, String[] filters)
    {
    	String outboundDoc = inboundDoc;
    	ParseTree tree = null;
    	String queryToRun = "";
    	try 
    	{
	    	for (int i=0; (i < filters.length); i++)
	    	{
	    		tree = parseExpression(filters[i]);
	    		bind(tree,uc);
	    		queryToRun = translate(tree);
	    		System.out.println("Apply query \n\t" + queryToRun + "\n to JSON doc");
	    		
	    		//reportOnMemory("UserContext", RegisterSingleton.getRegisters().getUserContextVars());
	    		//reportOnMemory("JSON", RegisterSingleton.getRegisters().getJSONVars());
	    		//reportOnMemory("Resources", RegisterSingleton.getRegisters().getResourceVars());
	    	} 	
	    	return outboundDoc;
    	}
    	catch (Exception e)
    	{
    		System.out.println("Exception thrown in filter method");
    		e.printStackTrace();
    	}
    	return outboundDoc;
    }
    
    private String isJsonPathMatch(String jsonInputString, String jsonQuery) 
    {
    	String jsonOutputString = jsonInputString;
    	//JsonPath.read(json, jsonPath, filters)
 //   	 JsonNode jsonOutput = JsonPath.read(jsonQuery, jsonInputString, JsonNode.class);
 //   	 jsonOutputString = jsonOutput.toString();
    	 return jsonOutputString;
    }
     
    
    // Bind user context stuff to any VAR's that we find in the tree
    public void bind(ParseTree t, UserContext uc)
    { 
		Iterator<String> iter;
		int j = 0;
		Object obj = null;
		String memorycell = null;

		m_userMemory = RegisterSingleton.getRegisters().getUserContextVars().keySet();
		for (iter = m_userMemory.iterator(); (iter.hasNext());)
		{
			memorycell = iter.next();
			obj = bind(memorycell,uc);
			RegisterSingleton.getRegisters().getUserContextVars().replace(memorycell, obj);
		}
    }
    
    private void reportOnMemory(String s, HashMap h)
    {
		Iterator<String> iter;
		int j = 0;
		Object obj = null;
		String key = null;

		m_userMemory = h.keySet();
		System.out.println("**** Dump " + s + " ****");
		for (iter = m_userMemory.iterator(); (iter.hasNext());)
		{
			key = iter.next();
			System.out.println(s + "[" + key + "] -> [" + h.get(key) + "]");
		}

		System.out.println("Entries for " + s + ": " + h.size());
		System.out.println("**********");
    }
    
    
    //
    // Parses a filter
    //
    private ParseTree parseExpression(String f)
    {
    	ParseTree	tree = null;
    	try
    	{
			System.out.println("Running for filter <" + f + ">");
			StringReader stream = new StringReader(f);
			ANTLRInputStream input = new ANTLRInputStream(stream);
	
			TescoFilterGrammarLexer lexer = new TescoFilterGrammarLexer(input);
	
			CommonTokenStream tokens = new CommonTokenStream(lexer);
	
			//
			// Parse each filter in turn using the antlr generated parser
			// Tidy this bit up so that we don't swap from Hash to keySet
			//
			TescoFilterGrammarParser parser = new TescoFilterGrammarParser(tokens);
			setParser(parser);

			tree = parser.ruleset(); 							// begin parsing at rule 'ruleset'
			
			return tree;
    	}
    	catch (Exception e)
    	{
    		System.out.println("Exception thrown in parse method");
    		e.printStackTrace();
    	}
    	return tree;
    }
    
    //
    // The toBind is always of the form x[.y]. The x is the class the y is the attribute in bean form.
    //
    private Object bind (String toBind, UserContext uc)
    {
    	//
    	// Company.CompanyName should xlate to a call 
    	// within uc of
    	//	uc.getCompany().getCompanyName()
    	//
    	// First find out if uc has getCompany().
    	// Then if it does  return something that is accessible through getCompanyName()
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
    
	// Translates filter to JSON PATH
    public String translate(ParseTree tree)
    {
    	String query = "";
    	TescoPredicateParserVisitor vistor = new TescoPredicateParserVisitor();
        query = vistor.visit(tree);
        return query;
    }
    
    //
    // Utility methods 
    //
    
    // 
    // turns a string into a bean compliant accessor "get" method such that the first char is in caps.
    //
    private String beanise(String in)
    {
    	String beanMethodName = new String("get" + in.substring(0, 1).toUpperCase() + in.substring(1));
    	return beanMethodName;
    }
}