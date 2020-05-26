package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	  WebElement x=driver.findElement(By.name("userName"));
     x.sendKeys("batman");
      
     driver.findElement(By.name("password")).sendKeys("batman");
     driver.findElement(By.name("login")).click();
     
  WebElement Passengercount =  driver.findElement(By.name("passCount"));
 
   
   Select obj = new Select(Passengercount);
   List<WebElement> L = obj.getOptions();
   obj.selectByVisibleText("4");
   
   selectdropclass obj1 = new selectdropclass();
//   obj1.dropdown("passCount", "4", driver);
   obj1.radio("tripType","oneway",driver);
   obj1.dropdown("fromPort", "Paris", driver);
   obj1.dropdown("fromMonth", "March", driver);
   obj1.dropdown("fromDay", "3", driver);
   obj1.dropdown("toPort", "Paris", driver);
   obj1.dropdown("toMonth", "March", driver);
   obj1.dropdown("toDay","26",driver);
   obj1.dropdown("airline", "Blue Skies Airlines", driver);
   obj1.radio("servClass","First", driver);
   
   driver.findElement(By.name("findFlights")).click();
   
   }
   
   
   

}


