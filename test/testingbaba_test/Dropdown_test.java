package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.Dropdown_page;

public class Dropdown_test extends baselibrary1 
{

	Dropdown_page dp;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		dp = new Dropdown_page();
	}
	
	@Test (priority = 1)
	public void clickOn()
	{
		dp.clickon();
	}
	
	@Test (priority = 2)
	public void selectOption()
	{
		dp.selectoption();
	}
	
	@Test (priority = 3)
	public void selectTitle()
	{
		dp.selecttitle();
	}
	
	@Test (priority = 4)
	public void selectOld()
	{
		dp.selectoldStyle();
	}
	
	@Test (priority = 5)
	public void stndmenuhtml()
	{
		dp.standardMenuhtm();
	}
	
}
