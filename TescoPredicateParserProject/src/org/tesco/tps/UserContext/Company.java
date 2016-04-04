package org.tesco.tps.UserContext;

public class Company {
	
	private	String	companyShortName;
	private String	companyLongName;
	private String	companyNumber;
	
	public Company()
	{
		
	}
	public Company(String csn, String cln, String cn)
	{
		setCompanyShortName(csn);
		setCompanyLongName(cln);
		setCompanyNumber(cn);
	}
	public String getCompanyShortName() { return companyShortName; }
	public String getCompanyLongName() { return companyLongName; }
	public String getCompanyNumber() { return companyNumber; }
	public void setCompanyShortName(String csn) { companyShortName = csn; }
	public void setCompanyLongName(String cln) { companyLongName = cln; }
	public void setCompanyNumber(String cn) { companyNumber = cn; }
}
