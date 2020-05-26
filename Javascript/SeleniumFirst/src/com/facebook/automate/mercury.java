package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mercury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		  WebElement x=driver.findElement(By.name("userName"));
	       x.sendKeys("batman");
	        
	       driver.findElement(By.name("password")).sendKeys("batman");
	       driver.findElement(By.name("login")).click();
	       
	       
	    mercuryexec obj = new mercuryexec();
        obj.method("fromMonth","April",driver);
	}

}
