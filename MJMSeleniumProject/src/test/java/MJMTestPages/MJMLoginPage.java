/**
 * 
 */
package MJMTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author nagarajug
 *
 */
public class MJMLoginPage {
	
	WebDriver driver=null;
	
	@Test
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome,driver", "E:\\NagSelenium\\MJMSeleniumProject\\drivers\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://mjmcardholder.mychoicepreferred.com/wap/#/");
				
		
		
	}

}
