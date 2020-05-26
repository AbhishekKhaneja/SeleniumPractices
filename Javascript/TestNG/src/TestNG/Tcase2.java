package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tcase2 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("http://newtours.demoaut.com/");
		
		System.out.println("Environment setup done");
	}
	@AfterTest
	public void closewindow()
	{
//		driver.close();
		
		System.out.println("window closed");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("Login done");
	}
	@Test 
	public void Test1()
	{
			System.out.println("Inside Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("Inside Test2");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Inside logout");
	}

}



