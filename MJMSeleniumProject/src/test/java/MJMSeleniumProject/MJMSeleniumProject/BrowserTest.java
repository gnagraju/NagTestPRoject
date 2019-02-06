/**
 * 
 */
package MJMSeleniumProject.MJMSeleniumProject;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author nagarajug
 *This includes the browser settings
 */
public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project path is :"+projectpath);
		
		
		//System.setProperty("webdriver.gecko.driver", projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", projectpath+"\\drivers\\IEDriver\\IEDriverServer.exe");
		//WebDriver driver =new InternetExplorerDriver();
		driver.get("https://mjmcardholder.mychoicepreferred.com/wap/");
		driver.manage().window().maximize();
		/*WebElement useremail= driver.findElement(By.xpath("//input[@placeholder='Example: xyz@gmail.com']"));
		useremail.sendKeys("gnagraju@gmail.com");*/
		//driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("gnagraju@gmail.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Wave@123");
		
		//driver.findElement(By.name("step1Submit")).click();
		driver.findElement(By.name("step1Submit")).sendKeys(Keys.RETURN);
		
		/*List<WebElement> inputitems= driver.findElements(By.xpath("//input"));
		int count =inputitems.size();
		System.out.println("count of input items: "+count);*/
		
		/*
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//driver.close();
		
	}

}
