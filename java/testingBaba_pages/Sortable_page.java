package testingBaba_pages;


import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class Sortable_page extends baselibrary1
{
	public Sortable_page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#interations']")
	private WebElement interation;
	
	@FindBy (xpath = "//a[@href='#tab_25']")
	private WebElement sortable;
	
	@FindBy (xpath = "//button[@onclick='sortTable()']")
	private WebElement sortBtn;
	
	@FindBy (xpath = "//*[@id=\"myTable\"]/tbody/tr/td")
	private WebElement table_name_country;
	
	
	public void clickonbtn()
	{
		practice.click();
		interation.click();
		sortable.click();
	}
	
	public void table_data()
	{	
		List<WebElement> keys1 = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
		List<WebElement> keys2 = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[2]"));
		
		//TreeMap<String, String> ele_table = new TreeMap();
//		
//		for(WebElement ele1 : keys1)
//		{
//			String text1 = ele1.getText();
//			
//			for(WebElement ele2 : keys2)
//			{
//				String text2 = ele2.getText();
//				ele_table.put(text1, text2);
//			}
//		}
//		
		String text1 = "";
		String text2 = "";
		
		for(WebElement el1 : keys1)
		{
		
			text1 = el1.getText();
		  //  System.out.println(text1);
			return;
			
		}
		
		for(WebElement el2 : keys2)
		{
		
			text2 = el2.getText();
		   // System.out.println(text2);
			
		}
		
		TreeSet<String> beforesort = new TreeSet<String>();
		
		beforesort.add(text1);
		
		
		for (String before : beforesort)
		{
			System.out.println(before);
		}
		
		//sortBtn.click();
		
//		for (int j=1; j<=8; j++)
//		{
//		ele_table.put(text1, text2);
//		System.out.println(ele_table);
//		}
//		return;
		
		//List<WebElement> aftersort = driver.findElements(By.xpath(""));
			
		
	}

}
