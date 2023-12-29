package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import applicationUtility.Application_utitlity;
import excelUtility.excelDataofTest;
import propertyUtility.propertyutility;
import screenshotUtility.Screenshotutility;
import waitUtility.waitUtility;

public class baselibrary1 implements excelDataofTest, propertyutility, Application_utitlity, Screenshotutility,waitUtility
{
	String configpath = "C:\\Users\\kkhan46\\eclipse-workspace\\Project1_Automation\\testData\\config.properties";
	public static WebDriver driver;
	
	public void LaunchURL() 
	{
		String path = "C:\\Users\\kkhan46\\eclipse-workspace\\Project1_Automation\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(getReadData("url"));
		driver.findElement(By.xpath("//button[text()='×']")).click();
	}
	
	@AfterTest 
	public void teardown()
	{
		driver.quit();
	}

	@Override
	public String getReadDataExcel(int sheetno, int row, int col) {
		
		String path = "C:\\\\Users\\\\kkhan46\\\\eclipse-workspace\\\\Project2_Automation\\\\testData\\\\testingBabaTextBox.xlsx";
		String value = "";
		try 
		{
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(sheetno);
			value = sheet.getRow(row).getCell(col).getStringCellValue();
		} 
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		return value;
	}

	@Override
	public String getReadData(String key) 
	{
		String value= "";
		
		try 
		{
			FileInputStream fis = new FileInputStream(configpath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
			
		}
		
		catch (Exception e) 
		{
			System.out.println("Error found in get read data"+e);
		}
		
		return value;
	}

	@Override
	public void doubleClickbtn(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.doubleClick(ele).perform();
		
	}

	@Override
	public void rightClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.contextClick(ele).perform();
		
	}

	@Override
	public void screenshot(String foldername, String filename) {
		
		try 
		{
			
			String path = "C:\\Users\\kkhan46\\eclipse-workspace\\Project1_Automation\\screenshot";
			String finalpath = path+ "\\" + foldername+ "\\" + filename+ ".png";
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File src = efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(finalpath));
			
		} 
		
		catch (Exception e) 
		{
			System.out.println("error found in screenshot"+e);
		}
	}

	@Override
	public void changewindow(int tabno) 
	{
		Set<String> tabs = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(tabs);
		driver.switchTo().window(list.get(tabno));
		
		
	}

	@Override
	public void uploadfile(String filepath) 
	{
		try 
		{
			StringSelection sel = new StringSelection(filepath);
			Clipboard toolkit = Toolkit.getDefaultToolkit().getSystemClipboard();
			toolkit.setContents(sel, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(400);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} 
		
		catch (Exception e) 
		{
			System.out.println("error found in upload file " +e);
		}
		
	}

	@Override
	public void elementTobeclickable(WebElement ele, int time) 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

	@Override
	public void alertispresent(int time) 
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}

	@Override
	public void visibilityofelements(WebElement ele, int time) 
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	@Override
	public void visibilityofele_fluentwait(WebElement ele, int timeout, int pollingtime) 
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeout, TimeUnit.SECONDS).
		pollingEvery(pollingtime, TimeUnit.SECONDS).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
	}

	@Override
	public void selectbyvisibletext(WebElement ele, String value) 
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
		
	}

	@Override
	public void selectbyvalue(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
		
	}

	@Override
	public void selectbyindex(WebElement ele, int index) 
	{
		Select sel = new Select(ele);
		sel.selectByIndex(index);
		
	}

	@Override
	public void mousehover(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}

	@Override
	public void mousehover_click(WebElement ele, String ele1) 
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.linkText(ele1)).click();
		
	}

	


}
