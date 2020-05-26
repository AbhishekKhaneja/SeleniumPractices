package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiodrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		  WebElement x=driver.findElement(By.name("userName"));
	       x.sendKeys("batman");
	       driver.findElement(By.name("password")).sendKeys("batman");
	       driver.findElement(By.name("login")).click();
	       
	     List<WebElement> h=  driver.findElements(By.name("tripType"));
	     System.out.println(h.size());
	     
	     for(int i=0;i<h.size();i++)
	     {
	    	 System.out.println(h.get(i).getAttribute("value"));
	     }
	     for(int i=0;i<h.size();i++)
	     {
	    	 if(h.get(i).getAttribute("value").equals("oneway"))
	    	 {
	    		 h.get(i).click();
	    	 }
	    	
	     }
	    // System.out.println(h.get(i).getAttribute("value"));
		
	}

}
