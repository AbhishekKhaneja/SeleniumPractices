package SelelniumGridPrac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGridPrac1 {

	static WebDriver driver ;
	@BeforeTest
	public void Test1() throws MalformedURLException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\my\\geckodriver.exe");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9988/wd/hub/"),DesiredCapabilities.firefox());
		driver.get("http://newtours.demoaut.com/");
	}
	@AfterTest
	public void Test5()
	{
	
		driver.quit();
	}
		@Test
		public void Test2()
		{
			System.out.println("Insideprac1test2");
		}

		@Test
		public void Test3()
		{
			System.out.println("Insideprac1test3");
		}

		@Test
		public void Test4()
		{
			System.out.println("Insideprac1test4");
		}
		
}

	


