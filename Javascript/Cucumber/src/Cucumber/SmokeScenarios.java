package Cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SmokeScenarios {
	static WebDriver driver;
	
	Properties Prop = new Properties();
	
	@Given("Chrome Browser")
	public void test1() throws IOException
	{
		FileInputStream Stream = new FileInputStream("C:\\Users\\my\\workspace\\Cucumber\\src\\Cucumber\\config.properties");
		Prop.load(Stream);
		String browser=Prop.getProperty("Browser");
		
	if(browser.equals("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");	
		driver = new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\my\\Downloads\\geckodriver.exe");	
		driver = new FirefoxDriver();	
	}
	}
	@And("Newtours url is working")
	public void test2()
	{
		driver.get("http://newtours.demoaut.com/");
	}
	@When("user enters username")
	public void test3()
	{
		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("batman");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Prop.getProperty("username"));
	}
	@And("user enters password")
	public void test4()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Prop.getProperty("password"));
	}
	@And("user Clicks on login buton")
	public void test5()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("batman");
	}
	

}
