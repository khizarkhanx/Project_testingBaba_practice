package testingBaba_pages;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baselibrary.baselibrary1;


public class text_box_page extends baselibrary1 
{
	ArrayList<String> actual;
	ArrayList<String> expected;
	
	public text_box_page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy (xpath = "//a[@href='#tab_1']")
	private WebElement textBox;
	
	@FindBy (xpath = "//input[@id='fullname1']")
	private WebElement name;
	
	@FindBy (xpath = "//input[@id='fullemail1']")
	private WebElement email;
	
	@FindBy (xpath = "//textarea[@id='fulladdresh1']")
	private WebElement currAdd;
	
	@FindBy (xpath = "//textarea[@id='paddresh1']")
	private WebElement perAdd;
	
	@FindBy (xpath = "//input[@value='Submit']")
	private WebElement submit;
	
	public void text_box_click()
	{
		practice.click();
		elements.click();
		textBox.click();
	}
	
	public void text_data_exl()
	{
		name.sendKeys(getReadDataExcel( 0, 1, 0));
		email.sendKeys(getReadDataExcel( 0, 1, 1));
		currAdd.sendKeys(getReadDataExcel( 0, 1, 2));
		perAdd.sendKeys(getReadDataExcel( 0, 1, 3));
	}
	
	public void submit_btn()
	{
		submit.click();
	}
	
	public void getDetails()
	{
		actual = new ArrayList<String>();
		expected = new ArrayList<String>();
		
		List<WebElement> list= driver.findElements(By.xpath("//div[@class=\"col-md-6 mt-5\"]/label"));
		int k=0;
		for (int i=1; i<=list.size()-1; i=i+2)
		{
			String text= list.get(i).getText();
			actual.add(text);
			expected.add(getReadDataExcel(0, 1, k));
			k++;
		}
		
	}
	
	public void verifyDetails()
	{
		
		for (String actualData : actual)
		{
			for (String expectedData : expected)
			{
				
				Assert.assertEquals(actualData, expectedData);
				expected.remove(0);
				break;
				
			}
		}
		
		screenshot("passed", "updatedata");
	}

}
