package testingBaba_pages;


import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baselibrary.baselibrary1;

public class Table_pages extends baselibrary1
{
	
	public Table_pages()
	{
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy (xpath = "//a[text()='web tables']")
	private WebElement table;
	
	@FindBy (xpath = "//iframe[@src='Webtable.html']")
	private WebElement tableframe;
	
	@FindBy (xpath = "//input[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement name;
	
	@FindBy (xpath = "//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$']")
	private WebElement email;
	
	@FindBy (xpath = "//button[@class='btn btn-success save-btn']")
	private WebElement save;
	
	@FindBy (xpath = "//button[text()='Edit']")
	private WebElement editbtn;
	
	@FindBy (xpath = "//input[@name='edit_name']")
	private WebElement editname;
	
	@FindBy (xpath = "//input[@name='edit_email']")
	private WebElement editemail;
	
	@FindBy (xpath = "//button[text()='Update']")
	private WebElement updatebox;
	
	
	public void clickpractice()
	{
		practice.click();
	}
	
	public void clickelement()
	{
		element.click();
	}
	
	public void clicktable()
	{
		table.click();
	}
	
	public void getnameEmail()
	{
		driver.switchTo().frame(tableframe);
		
		for (int i = 1; i<=10; i++)
		{
		
		name.sendKeys(getReadDataExcel(3, i, 0));
		email.sendKeys(getReadDataExcel(3, i, 1));
		save.click();
		
		}
	}
	
	public void upadateData()
	{
			List<WebElement> ele = driver.findElements(By.xpath("//button[text()='Edit']"));
			
			int i=1;
			
			for(WebElement editbtn : ele)
			{
				editbtn.click();
				editname.clear();
				editname.sendKeys(getReadDataExcel(3, i, 2));
				editemail.clear();
				editemail.sendKeys(getReadDataExcel(3, i, 3));
				updatebox.click();
				i++;
			}
	}
	
	public void datacheckname()
	{
		List<WebElement> ele2 = driver.findElements(By.xpath("//*[@class=\"table table-bordered data-table\"]/thead/tr/following::tbody/tr/td[1]"));
		
		int i =1;
		
		for (WebElement updatenamedata : ele2)
		{
			
		Assert.assertEquals(updatenamedata.getText(), getReadDataExcel(3, i, 2));
		i++;
		
		}
	}
	
	public void datacheckemail()
	{
		List<WebElement> ele3 = driver.findElements(By.xpath("//*[@class=\"table table-bordered data-table\"]/thead/tr/following::tbody/tr/td[2]"));
		
		int i =1;
		
		for (WebElement updateemaildata : ele3)
		{
			
		Assert.assertEquals(updateemaildata.getText(), getReadDataExcel(3, i, 3));
		i++;
		
		}
	}
	
	
}
