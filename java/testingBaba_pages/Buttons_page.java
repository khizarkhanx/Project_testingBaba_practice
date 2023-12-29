package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.baselibrary1;


public class Buttons_page extends baselibrary1 
{

	public Buttons_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy (xpath = "//a[@href='#tab_5']")
	private WebElement buttons;
	
	@FindBy (xpath = "//button[@ondblclick='doubletext()']")
	private WebElement doubleclick;
	
	@FindBy (xpath = "//button[@oncontextmenu='righttext()']")
	private WebElement rightclick;
	
	@FindBy (xpath = "//button[@onclick='clicktext()']")
	private WebElement clickme;
	
	@FindBy (xpath = "//p[text()='you have done a double click']")
	private WebElement double_text;
	
	@FindBy (xpath = "//p[text()='you have done a right click']")
	private WebElement right_text;
	
	@FindBy (xpath = "//p[text()='you have done a dynamic click']")
	private WebElement click_text;
	
	public void practiceClick()
	{
		practice.click();
		element.click();
		//buttons.click();
	}
	public void practiceClick2()
	{

		buttons.click();
	}
	
	public void doubleClickbtn()
	{
		doubleClickbtn(doubleclick);
		Assert.assertEquals(double_text.getText(), getReadDataExcel(4, 1, 0));
	}
	
	public void rightClick()
	{
		rightClick(rightclick);
		Assert.assertEquals(right_text.getText(), getReadDataExcel(4, 2, 0));
	}
	
	public void clickme()
	{
		clickme.click();
		Assert.assertEquals(click_text.getText(), getReadDataExcel(4, 3, 0));
	}
}
