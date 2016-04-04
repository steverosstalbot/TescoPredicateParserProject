package org.tesco.tps.filterhandler;

import java.util.HashMap;

final public class RegisterSingleton {
	
	public  HashMap 			resourcevars = null; 	// resource against filter list
	public  HashMap 			usercontextvars = null; 	// unbound variables
	public  HashMap 			jsonvars = null; 	// unbound JSON variables
	static public	RegisterSingleton	registers = null;
	
	protected RegisterSingleton()
	{
		if (resourcevars == null)
			resourcevars = new HashMap();
		if (usercontextvars == null)
			usercontextvars = new HashMap();
		if (jsonvars == null)
			jsonvars = new HashMap();
	}
	
	static public RegisterSingleton getRegisters()
	{
		if (registers == null)
		{
			registers = new RegisterSingleton();
		}
		return registers;
	}
	
	public HashMap getResourceVars()
	{
		if (resourcevars == null)
		{
			resourcevars = new HashMap(); 
			RegisterSingleton.getRegisters().getJSONVars();
		} 
		return resourcevars;
	}
	
	public HashMap getUserContextVars()
	{
		if (usercontextvars == null)
		{
			usercontextvars = new HashMap();
		} 
		return usercontextvars;
	}
	
	public HashMap getJSONVars()
	{
		if (jsonvars == null)
			jsonvars = new HashMap();	
		return jsonvars;
	}
}
