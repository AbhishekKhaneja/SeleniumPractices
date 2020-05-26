package SelelniumGridPrac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGridPrac2 {
	
	static WebDriver driver;
	@BeforeTest
	public void Test1() throws MalformedURLException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\chromedriver.exe");
	 driver = new RemoteWebDriver(new URL("http://localhost:9988/wd/hub/"),DesiredCapabilities.chrome());
		driver.get("http://newtours.demoaut.com/");
   }
	@Test
	public void Test2()
	{
		System.out.println("Insideprac2test2");
	}

	@Test
	public void Test3()
	{
		System.out.println("Insideprac2test3");
	}

	@Test
	public void Test4()
	{
		System.out.println("Insideprac2test4");
	}
	@AfterTest
	public void Test5()
	{
		driver.quit();
	}
}
