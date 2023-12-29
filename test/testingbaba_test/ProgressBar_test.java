package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.ProgressBar_page;
import testingBaba_pages.ToolTips_page;

public class ProgressBar_test extends baselibrary1
{
public ProgressBar_page pp;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		pp = new ProgressBar_page();
	}
	
	@Test (priority = 1)
	public void clickOnbtn()
	{
		pp.clickonbtn();
	}
	
	@Test (priority = 2)
	public void clickonbar()
	{
		pp.clickonproBar();
	}
	
	@Test (priority = 3)
	public void startbar()
	{
		pp.startbtn();
	}
	

}
