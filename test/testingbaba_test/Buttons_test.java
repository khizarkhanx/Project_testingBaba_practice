package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.Buttons_page;

public class Buttons_test extends baselibrary1 

{

	Buttons_page bb;
	
	@BeforeTest
	public void launchurl()
	{
		LaunchURL();
		bb = new Buttons_page();
		
	}
	
	@Test (priority = 1)
	public void practiceclick()
	{
		bb.practiceClick();
	}
	@Test (priority = 2)
	public void practiceclick2()
	{
		bb.practiceClick2();
	}
	
		
	@Test (priority = 3)
	public void doubleclick()
	{
		bb.doubleClickbtn();
	}
	
	@Test (priority =4)
	public void rightclick()
	{
		bb.rightClick();
	}
	
	@Test (priority = 5)
	public void clickme()
	{
		bb.clickme();
	}
}
