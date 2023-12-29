package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baselibrary.baselibrary1;
import testingBaba_pages.check_box;

public class check_box_test extends baselibrary1
{

	check_box ab;
	
	@BeforeTest
	public void launchurl()
	{
		LaunchURL();
		ab = new check_box();
	}
	
	@Test (priority =1)
	public void checkBoxclick()
	{
		ab.check_box_click();
	}
	
	@Test (priority=2)
	public void mobileClick()
	{
		
		ab.mobile_click();
	}
	
	@Test (priority = 3)
	public void laptopClick()
	{
		ab.laptop_click();
	}
	
	@Test (priority = 4)
	public void desktopClick()
	{
		ab.desktop_click();
	}
}
