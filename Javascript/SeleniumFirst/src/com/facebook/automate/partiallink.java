package com.facebook.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
	

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.linkText("Link Text")).click();
	//	driver.findElement(By.partialLinkText("Link")).click();
		
	}

}
