package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.ConfigReader;

public class Testconfig {

	@Test 
	public void testchrome() throws IOException
	{
		ConfigReader obj = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", obj.getChromePath());
		WebDriver driver = new ChromeDriver();
		driver.get(obj.getURL());
	}
}
