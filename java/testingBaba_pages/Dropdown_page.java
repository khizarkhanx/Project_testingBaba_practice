package testingBaba_pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baselibrary1;

public class Dropdown_page extends baselibrary1 
{

	public Dropdown_page ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy (xpath = "//a[@href='#tab_24']")
	private WebElement selectmenu;
	
	@FindBy (xpath = "//*[@id=\"tab_24\"]/form/div/div[1]/select")
	private WebElement selectopt;
	
	@FindBy (xpath = "//*[@id=\"tab_24\"]/form/div/div[2]/select")
	private WebElement selecttitle;
	
	@FindBy (xpath = "//*[@id=\"tab_24\"]/form/div/div[3]/div/select")
	private WebElement selectoldstyle;
	
	@FindBy (xpath = "//*[@id=\"tab_24\"]/form/div/div[5]/div/select/option[1]")
	private WebElement standardmenuhtml;
	
	@FindBy (xpath = "//*[@id=\"tab_24\"]/form/div/div[5]/div/select/option[2]")
	private WebElement standardmenucss;
	
	@FindBy (xpath = "//*[@id=\"tab_24\"]/form/div/div[5]/div/select/option[3]")
	private WebElement standardmenuphp;
	
	@FindBy (xpath = "//*[@id=\"tab_24\"]/form/div/div[5]/div/select/option[4]")
	private WebElement standardmenujava;
	
	
	
	public void clickon()
	{
		practice.click();
		widget.click();
		selectmenu.click();
	}
	
	public void selectoption()
	{
		selectopt.click();
		selectbyvalue(selectopt, "Group 1, Option 1");
		selectopt.click();
	}
	
	public void selecttitle()
	{
		selecttitle.click();
		selectbyindex(selecttitle, 4);
		selecttitle.click();
	}
	
	public void selectoldStyle()
	{
		selectoldstyle.click();
		selectbyindex(selectoldstyle, 5);
		selectoldstyle.click();
	}
	
	public void standardMenuhtm()
	{
		try 
		{
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_ENTER);
			standardmenuhtml.click();
			standardmenucss.click();
			standardmenuphp.click();
			standardmenujava.click();
			rob.keyRelease(KeyEvent.VK_ENTER);
			
		} 
		catch (Exception e) 
		{
			System.out.println("error found in standard menu " +e);
		}
	}
	
}
