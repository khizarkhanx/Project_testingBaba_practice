package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class Newtab_page extends baselibrary1 
{

	public Newtab_page()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#alerts']")
	private WebElement alerts;
	
	@FindBy (xpath = "//a[@href='#tab_11']")
	private WebElement browindow;
	
	@FindBy (xpath = "//a[@href='https://www.google.co.in/']")
	private WebElement newtab;
	
	public void clickon()
	{
		practice.click();
		alerts.click();
		browindow.click();
	}
	
	public void newTab()
	{
		newtab.click();
		changewindow(1);
		driver.close();
		changewindow(0);
	}
}
