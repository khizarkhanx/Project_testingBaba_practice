package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.Table_pages;

public class Table_test extends baselibrary1
{

	Table_pages tt;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		tt = new Table_pages();
		
	}
	
	@Test (priority = 1)
	public void parcticeclick()
	{
		tt.clickpractice();
	}
	
	@Test (priority = 2)
	public void elementclick()
	{
		tt.clickelement();
	}
	
	@Test (priority = 3)
	public void tableclick()
	{
		tt.clicktable();
	}
	
	@Test (priority = 4)
	public void nameget()
	{
		tt.getnameEmail();
	}
	
	@Test (priority = 5)
	public void updatedata()
	{
		tt.upadateData();
	}
	
	@Test (priority = 6)
	public void updateNamedata()
	{
		tt.datacheckname();
	}
	
	@Test (priority = 7)
	public void updateEmaildata()
	{
		tt.datacheckemail();
	}
	
	
	
	
}
