package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.Newtab_page;

public class Newtab_test extends baselibrary1
{

	Newtab_page np;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		np = new Newtab_page();
	}
	
	@Test (priority = 1)
	public void clickOn()
	{
		np.clickon();
	}
	
	@Test (priority = 2)
	public void newTabs()
	{
		np.newTab();
	}
}
