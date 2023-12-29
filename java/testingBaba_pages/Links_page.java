package testingBaba_pages;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.baselibrary1;


public class Links_page extends baselibrary1 
{
	
	public Links_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-toggle='collapse']")
	private WebElement element;
	
	@FindBy (xpath = "//a[@href='#tab_6']")
	private WebElement links;
	
	@FindBy (xpath = "//a[text()='Demo Page']")
	private WebElement demopage;
	
	@FindBy (xpath = "//a[@onclick='Created()']")
	private WebElement created;
	
	@FindBy (xpath = "//p[@id='link-result']")
	private WebElement createdtext;
	
	
	public void clickon()
	{
		practice.click();
		element.click();
		links.click();
	}
	
	public void demopage()
	{
		demopage.click();
		changewindow(1);
		driver.close();
		changewindow(0);
	}
	
	public void created()
	{
		created.click();
		Assert.assertEquals(createdtext.getText(), getReadDataExcel(5, 0, 0));
	}

}
