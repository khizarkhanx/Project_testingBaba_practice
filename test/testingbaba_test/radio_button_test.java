package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baselibrary1;
import testingBaba_pages.radio_button_page;

public class radio_button_test extends baselibrary1
{
	 radio_button_page ac;
	  
	 
	 @BeforeTest
	  public void launchurl()
	  {
		  LaunchURL();
		  ac= new radio_button_page();
	  }
	 
	 @Test (priority=1)
	 public void onclick()
	 {
		 ac.click_on();
	 }
	 
	 @Test (priority = 2)
	 public void yesclick()
	 {
		 ac.yes_click();
	 }
	 
	 @Test (priority = 3)
	 public void impclick()
	 {
		 ac.imp_click();
	 }
	 
	 @Test (priority = 4)
	 public void noclick()
	 {
		 ac.no_click();
	 }

}
