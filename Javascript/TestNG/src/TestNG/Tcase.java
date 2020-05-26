package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tcase {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void login1()
	{
		driver.findElement(By.xpath("//td[@width='112']//input")).sendKeys("batman");
		driver.findElement(By.xpath("//td[@width='112']//following::input[2]")).sendKeys("batman");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("In login");
	}
	@Test(dataProvider="testdata1")
	public void login(String P1,String P2)
	{
		driver.findElement(By.xpath("//td[@width='112']//input")).sendKeys(P1);
		driver.findElement(By.xpath("//td[@width='112']//following::input[2]")).sendKeys(P2);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("In login");
	}
	@DataProvider(name="testdata1")
	public Object[][] testdata()
	{
		return new Object[][]
				{
			{"batman" ,"batman"},
			{"4","5"},
			{"test","test3"}
				};
	}
	@AfterMethod
	public void clickonbutton()
	{
	
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
	}
	@Test(priority =0,groups={"admin"})
public void oneway()
{
		//driver.findElement(By.xpath("//input[@value=oneway]")).click();
	System.out.println("booking First done");
}
	@Test(priority =0,groups={"admin","user"})
	public void roundtrip()
	{
		//driver.findElement(By.xpath("//input[@value=roundtrip]")).click();
	}
	@BeforeTest
	public void environSetup()
	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		System.out.println("environemnt setup");
	}
	@AfterTest
	public void closeEnvironment()
	{
		driver.close();
		System.out.println("Environment close");
	}
	
	}
