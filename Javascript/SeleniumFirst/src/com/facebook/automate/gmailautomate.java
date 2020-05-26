package com.facebook.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailautomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
		
		driver.findElement(By.name("identifier")).sendKeys("abby.khaneja@gmail.com");
	driver.findElement(By.className("CwaK9")).click();
	//driver.findElement(By.cssSelector("div#password")).sendKeys("9971662958");;
	driver.findElement(By.xpath("//.//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("9971662958");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.className("CwaK9")).click();
	
	}

}
