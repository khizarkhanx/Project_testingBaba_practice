package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.UploadDown_page;

public class UploadDown_test extends baselibrary1 {
	
	UploadDown_page ud;
	
	@BeforeTest 
	public void launchurl()
	{
		LaunchURL();
		ud = new UploadDown_page();
	}
	
	@Test (priority = 1)
	public void clickOn()
	{
		ud.clickon();
	}
	
	@Test (priority = 2)
	public void uploaddown()
	{
		ud.clickonuploaddown();
	}
	
	@Test (priority = 3)
	public void uploadfile()
	{
		ud.clickonuploadfile();
	}

}
