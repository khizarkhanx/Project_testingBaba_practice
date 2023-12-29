package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.text_box_page;

public class text_box_test extends baselibrary1 
{

	text_box_page aa;
	
	@BeforeTest
	public void Launchurl()
	{
		LaunchURL();
		aa = new text_box_page();
	}
	
	@Test(priority = 1)
	public void Text_box_click()
	{
		aa.text_box_click();
	}
	
	@Test(priority = 2)
	public void Text_box_exl()
	{
		aa.text_data_exl();
	}
	
	@Test(priority = 3)
	public void Submit()
	{
		aa.submit_btn();
	}
	
	@Test (priority=4)
	public void getdetails()
	{
		aa.getDetails();
	}
	
	@Test (priority = 5)
	public void getDetails()
	{
		aa.getDetails();
	}
}
