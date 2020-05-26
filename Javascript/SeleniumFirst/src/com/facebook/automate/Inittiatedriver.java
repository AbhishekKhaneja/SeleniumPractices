package com.facebook.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inittiatedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		  WebElement x=driver.findElement(By.name("userName"));
	       x.sendKeys("test");
	        
	       driver.findElement(By.name("password")).sendKeys("test");
	       
		
		driver.findElement(By.name("login")).click();
//		WebElement X=driver.findElement(By.name("firstName"));
//		X.sendKeys("Abhishek");
//		X=driver.findElement(By.name("lastName"));
//				X.sendKeys("Khaneja");
//				
//				driver.findElement(By.name("Phone")).sendKeys("909090909090");
//				driver.findElement(By.id("userName")).sendKeys("abby.khaneja@gmail.com");
//				driver.findElement(By.name("address1")).sendKeys("Hno136");;
//				driver.findElement(By.name("city"));
				
      
        

	}

}
