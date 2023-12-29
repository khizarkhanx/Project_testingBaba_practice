package applicationUtility;

import org.openqa.selenium.WebElement;

public interface Application_utitlity 
{
	
	public void doubleClickbtn (WebElement ele);
	public void rightClick (WebElement ele);
	public void changewindow(int tabno);
	public void uploadfile(String filepath);
	public void selectbyvisibletext(WebElement ele, String value);
	public void selectbyvalue(WebElement ele, String value);
	public void selectbyindex(WebElement ele, int index);
	public void mousehover(WebElement ele);
	public void mousehover_click(WebElement ele, String ele1);

}
