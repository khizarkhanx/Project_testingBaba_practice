package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baselibrary.baselibrary1;


public class radio_button_page extends baselibrary1
{

	public radio_button_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy (xpath = "//a[@href='#tab_3']")
	private WebElement radiobtn;
	
	@FindBy (xpath = "//input[@id='yes']")
	private WebElement yesClick;
	
	@FindBy (xpath = "//p[text()='You have selected yes']")
	private WebElement yes_text;
	
	@FindBy (xpath = "//input[@id='impressive']")
	private WebElement impresiveClick;
	
	@FindBy (xpath = "//p[text()='You have selected impressive']")
	private WebElement impressive_text;
	
	@FindBy (xpath = "//input[@id='no']")
	private WebElement noClick;
	
	@FindBy (xpath = "//p[text()='You have selected no']")
	private WebElement no_text;
	
	public void click_on()
	{
		practice.click();
		elements.click();
		radiobtn.click();
	}
	
	public void yes_click()
	{
		yesClick.click();
		Assert.assertEquals(yes_text.getText(), getReadDataExcel(2, 1, 1));
	}
	
	public void imp_click()
	{
		impresiveClick.click();
		Assert.assertEquals(impressive_text.getText(), getReadDataExcel(2, 2, 1));
	}
	
	public void no_click()
	{
		noClick.click();
		Assert.assertEquals(no_text.getText(), getReadDataExcel(2, 3, 1));
	}
}
