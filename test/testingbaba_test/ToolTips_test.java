package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.ToolTips_page;

public class ToolTips_test extends baselibrary1
{
	
	ToolTips_page tt;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		tt = new ToolTips_page();
	}
	
	@Test (priority = 1)
	public void clickOnbtn()
	{
		tt.clickonbtn();
	}
	
	@Test (priority = 2)
	public void hooverme()
	{
		tt.hooverMe();
	}
	
	

}
