package tesco.tps.filteringSvcLogic;

public class UserContext {
	private User		user;
	private Company		company;
	
	public UserContext()
	{
		
	}
	public UserContext(String u, String un, String fn, String ln, String ac, String rn, String em, String csn, String cln, String cn)
	{
		setUser(new User(u, un,fn,ln,ac,rn,em));
		setCompany(new Company(csn,cln,cn));
	}
	
	public User getUser() { return user; }
	public Company getCompany() { return company; }
	public void setUser(User u) { user = u; }
	public void setCompany(Company c) { company = c; }
}
