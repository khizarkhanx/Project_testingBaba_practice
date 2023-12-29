package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class ProgressBar_page extends baselibrary1 
{
	public ProgressBar_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy (xpath = "//a[@href='#tab_20']")
	private WebElement progressbar;
	
	@FindBy (xpath = "//div[@id='my-progress']")
	private WebElement proBar;
	
	@FindBy (xpath = "//button[@onclick='move()']")
	private WebElement startbtn;
	
	public void clickonbtn()
	{
		practice.click();
		widget.click();
		progressbar.click();
	}
	
	public void clickonproBar()
	{
		proBar.click();
	}
	
	public void startbtn()
	{
		try 
		{
			String beforestart =proBar.getAttribute("style");
			System.out.println("Before start status of bar " +beforestart);
			startbtn.click();
			Thread.sleep(2000);
			String complete =proBar.getAttribute("style");
			System.out.println("After complete status of bar " +complete);
			
			
		} 
		
		catch (Exception e)
		{
			System.out.println("Issue in satart button "+e);
		}
	}
	

}
