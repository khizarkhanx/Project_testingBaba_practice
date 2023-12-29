package waitUtility;

import org.openqa.selenium.WebElement;

public interface waitUtility {

	public void elementTobeclickable(WebElement ele, int time);
	public void alertispresent (int time);
	public void visibilityofelements(WebElement ele, int time);
	public void visibilityofele_fluentwait(WebElement ele, int timeout, int pollingtime);

	
}
