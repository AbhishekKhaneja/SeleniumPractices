package com.facebook.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 driver.findElement(By.name("email")).sendKeys("abby.khaneja@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("abby.khaneja@gmail.com");
		 driver.findElement(By.id("loginbutton")).click();
		 
		 

	}

}
