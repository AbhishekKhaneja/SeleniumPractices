/**
 * 
 */
package newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author my
 *
 */
public class Setup {
	public static WebDriver driver;
	public void up(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		loginpage obj = new loginpage();
		obj.login("batman","batman");
	}

}
