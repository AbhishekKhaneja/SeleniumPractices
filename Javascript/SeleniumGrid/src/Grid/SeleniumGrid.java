package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	
//	public static void main (String[] args) throws MalformedURLException
//	{
	@Test
	public void Test1() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\chromedriver.exe");	
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:7777/wd/hub"),
				DesiredCapabilities.chrome());
		driver.get("http://newtours.demoaut.com/");
	}	
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\my\\geckodriver.exe");	
//		WebDriver driver1 = new RemoteWebDriver(new URL("http://localhost:7777/wd/hub"),
//				DesiredCapabilities.firefox());
//		driver1.get("http://newtours.demoaut.com/");
	}


