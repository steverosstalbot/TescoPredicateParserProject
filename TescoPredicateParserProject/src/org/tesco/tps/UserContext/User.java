package org.tesco.tps.UserContext;

public class User {
	
	private String	uuid;
	private String	userName;
	private String	firstName;
	private String	lastName;
	private String	autorizationCategory;
	private String	roleName;
	private String	eMail;
	
	public User()
	{
		
	}
	public User(String u, String un, String fn, String ln, String ac, String rn, String em)
	{
		setUuid(u);
		setUserName(un);
		setFirstName(fn);
		setLastName(ln);
		setAutorizationCategory(ac);
		setRoleName(rn);
		setEMail(em);
	}
	public String getUuid() 					{ return uuid; }
	public String getUserName() 				{ return userName; }
	public String getFirstName() 				{ return firstName; }
	public String getLastName() 				{ return lastName; }
	public String getAutorizationCategory()		{ return autorizationCategory; }
	public String getRoleName()					{ return roleName; }
	public String getEMail()					{ return eMail; }
	public void setUuid(String u) 				{ uuid = u; }
	public void setUserName(String un) 			{ userName = un; }
	public void setFirstName(String fn) 		{ firstName = fn; }
	public void setLastName(String ln) 			{ lastName = ln; }
	public void setAutorizationCategory(String ac) 	{ autorizationCategory = ac; }
	public void setRoleName(String rn)			{ roleName = rn; }
	public void setEMail(String em)				{ eMail = em; }
}
