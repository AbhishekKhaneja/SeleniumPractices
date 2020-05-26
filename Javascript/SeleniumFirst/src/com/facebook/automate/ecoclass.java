package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecoclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		  WebElement x=driver.findElement(By.name("userName"));
	       x.sendKeys("batman");
	        
	       driver.findElement(By.name("password")).sendKeys("batman");
	       driver.findElement(By.name("login")).click();
	       
	       	      
	      triptype obj = new triptype();
	      obj.trip("tripType", "oneway", driver);
	      obj.trip("servClass", "Business", driver);
      
	}

}
