package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class Nestedframes_page extends baselibrary1 
{

	public Nestedframes_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#alerts']")
	private WebElement alerts;
	
	@FindBy (xpath = "//a[@href='#tab_14']")
	private WebElement nestframe;
	
	@FindBy (xpath = "//iframe[@src='target1.html']")
	private WebElement frame1;
	
	@FindBy (xpath = "//iframe[@src='text.html']")
	private WebElement frame2;
	
	@FindBy (xpath = "//iframe[@src='example.html']")
	private WebElement frame3;
	
	
	@FindBy (xpath = "//a[@href='text1.html']")
	private WebElement frameclicklink;
	
	public void clickon()
	{
		practice.click();
		alerts.click();
		nestframe.click();
	}
	
	public void clickFrame() 
	{
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame2);
		driver.switchTo().frame(frame3);
		frameclicklink.click();
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
	}
	
	
}
