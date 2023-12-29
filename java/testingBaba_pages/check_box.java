package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baselibrary.baselibrary1;


public class check_box extends baselibrary1 
{

	public check_box ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy (xpath = "//a[contains(text(),'check box')]")
	private WebElement checkbox;
	
	@FindBy (xpath = "//iframe[@src='Checkbox.html']")
	private WebElement iframe;
	
	@FindBy (xpath = "//input[@id='myCheck']")
	private WebElement mobile;
	
	@FindBy (xpath = "//h6[text()='You are selected Mobile']")
	private WebElement mobile_text;
	
	@FindBy (xpath = "//input[@id='mylaptop']")
	private WebElement laptop;
	
	@FindBy (xpath = "//h6[text()='You are Selected Laptop']")
	private WebElement laptop_text;
	
	@FindBy (xpath = "//input[@id='mydesktop']")
	private WebElement desktop;
	
	@FindBy (xpath= "//h6[text()='You are Selected Desktop']")
	private WebElement desktop_text;
	
	
	public void check_box_click()
	{
		practice.click();
		elements.click();
		checkbox.click();
	}
	
	public void mobile_click()
	{
		driver.switchTo().frame(iframe);
		mobile.click();
		Assert.assertEquals(mobile_text.getText(), getReadDataExcel(1, 1, 1));
		driver.switchTo().defaultContent();
		
	}
	
	public void laptop_click()
	{
		driver.switchTo().frame(iframe);
		laptop.click();
		Assert.assertEquals(laptop_text.getText(), getReadDataExcel(1, 2, 1));
		driver.switchTo().defaultContent();
	}
	
	public void desktop_click()
	{
		driver.switchTo().frame(iframe);
		desktop.click();
		Assert.assertEquals(desktop_text.getText(), getReadDataExcel(1, 3, 1));
		driver.switchTo().defaultContent();
	}
}
