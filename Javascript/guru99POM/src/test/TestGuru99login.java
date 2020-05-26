package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.guru99homepage;
import Pages.guru99loginpage;

public class TestGuru99login {
	
	WebDriver driver;
	guru99homepage homeobj;
	guru99loginpage loginobj;
	
	@BeforeTest(groups="A")
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://demo.guru99.com/V4/");
		
	}
	@Test(groups="A",invocationCount=4)
	public void test_home_page_appear_correct(){
		loginobj = new guru99loginpage(driver);
		String loginpagetitle = loginobj.titletest();
		Reporter.log("Title Test");
		Assert.assertTrue(loginpagetitle.toLowerCase().contains("guru99 bank"));
		
//		loginobj.login("mngr129126","qAgUgeb");
//		
//		homeobj = new guru99homepage(driver);
//		 
//		String HomepageDashboardusername = homeobj.getHomePageDashboardUserName();
//		Assert.assertTrue(HomepageDashboardusername.toLowerCase().contains("manger id : mngr129126"));
	}
	
	@Test(groups="B")
	public void Test()
	{ 
		System.out.println("Abhishek");
	}
	
	

}
