package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;

import testingBaba_pages.Nestedframes_page;

public class Nestedframes_test extends baselibrary1 
{

	Nestedframes_page nf;
	
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		nf = new Nestedframes_page();
	}
	
	@Test (priority = 1)
	public void clickOn()
	{
		nf.clickon();
	}
	
	@Test (priority = 2)
	public void frameclick()
	{
		nf.clickFrame();
	}
}
