package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.Sortable_page;

public class Sortable_test extends baselibrary1
{

	Sortable_page sp;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		sp = new Sortable_page();
	}
	
	@Test (priority = 1)
	public void clickonbtn()
	{
		sp.clickonbtn();
	}
	
	@Test (priority = 2)
	public void tableData()
	{
		sp.table_data();
	}
}
