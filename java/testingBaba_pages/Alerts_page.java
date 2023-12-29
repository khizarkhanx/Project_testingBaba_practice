package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class Alerts_page extends baselibrary1 
{

	public Alerts_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#alerts']")
	private WebElement alerts;
	
	@FindBy (xpath = "//a[@href='#tab_12']")
	private WebElement alert;
	
	@FindBy (xpath = "//button[@onclick='myalert()']")
	private WebElement clickonalert;
	
	@FindBy (xpath = "//button[@onclick='aftersec5()']")
	private WebElement fivesecalert;
	
	@FindBy (xpath = "//button[@onclick='myconfirm()']")
	private WebElement confirmbox;
	
	@FindBy (xpath = "//button[@onclick='myprompt()']")
	private WebElement prombox;
	
	public void clickon()
	{
		practice.click();
		alerts.click();
		alert.click();
	}
	
	public void clickOnalert()
	{
		clickonalert.click();
		driver.switchTo().alert().accept();
	}
	
	public void fiveSecAlert()
	{
		fivesecalert.click();
		alertispresent(6);
		driver.switchTo().alert().accept();
	}
	
	public void confirmBox()
	{
		confirmbox.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void promBox()
	{
		prombox.click();
		driver.switchTo().alert().sendKeys("ok");
		driver.switchTo().alert().accept();
	}
}
