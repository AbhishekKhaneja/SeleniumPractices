package testnewtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import newtours.Setup;
import newtours.flightfinderpage;
import newtours.loginpage;

public class testloginpage {
	
	Setup obj = new Setup();
	@Test
	public void Login()
	{
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
	 obj.up();
	 }
	
}
