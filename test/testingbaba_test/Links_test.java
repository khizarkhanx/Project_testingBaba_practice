package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.Links_page;

public class Links_test extends baselibrary1 
{

	Links_page cc;
	
	@BeforeTest
	public void lunchurl()
	{
		LaunchURL();
		cc = new Links_page();
	}
	
	@Test (priority = 1)
	public void clickOn()
	{
		cc.clickon();
	}
	
	@Test (priority = 2)
	public void demoLinks()
	{
		cc.demopage();
	}
	
	@Test (priority = 3)
	public void created()
	{
		cc.created();
	}
}
