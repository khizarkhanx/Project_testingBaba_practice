package testingBaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class UploadDown_page extends baselibrary1
{

	String filepath = "C:\\Users\\kkhan46\\eclipse-workspace\\Project1_Automation\\testData\\Screenshot (811).png";
	
	public UploadDown_page() 
	{
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy (xpath = "//a[@href='#tab_8']")
	private WebElement uploadDown;
	
	@FindBy (xpath = "//label[text()='Select a file']")
	private WebElement uploadfile;
	
	
	public void clickon()
	{
		practice.click();
		element.click();
	}
	
	public void clickonuploaddown()
	{
		uploadDown.click();
	}
	
	public void clickonuploadfile()
	{
		try 
		{
			elementTobeclickable(uploadfile, 2);
			uploadfile.click();
			Thread.sleep(3000);
			uploadfile(filepath);
			
		} 
		
		catch (Exception e) 
		{
			System.out.println("error in file upload " +e);
		}
		
	}
}
