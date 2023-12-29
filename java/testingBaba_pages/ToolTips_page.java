package testingBaba_pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class ToolTips_page extends baselibrary1
{
	public ToolTips_page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy (xpath = "//a[@href='#tab_22']")
	private WebElement tooltip;
	
	@FindBy (xpath = "//button[@data-toggle='tooltip']")
	private WebElement hoovermebtn;
	
	
	public void clickonbtn()
	{
		practice.click();
		widget.click();
		tooltip.click();
	}
	
	public void hooverMe()
	{
		mousehover(hoovermebtn);
		String toolt = hoovermebtn.getAttribute("title");
		System.out.println(toolt);
	}

}
