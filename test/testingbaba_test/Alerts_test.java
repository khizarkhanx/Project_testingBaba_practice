package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.Alerts_page;

public class Alerts_test extends baselibrary1
{

	Alerts_page ap;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		ap = new Alerts_page();
	}
	
	@Test (priority = 1)
	public void clickOn()
	{
		ap.clickon();
	}
	
	@Test (priority = 2)
	public void clickOnAlert()
	{
		ap.clickOnalert();
	}
	
	@Test (priority = 3)
	public void fivesecAlert()
	{
		ap.fiveSecAlert();
	}
	
	@Test (priority = 4)
	public void confirmBox()
	{
		ap.confirmBox();
	}
	
	@Test (priority = 5)
	public void promptbox()
	{
		ap.promBox();
	}
}
