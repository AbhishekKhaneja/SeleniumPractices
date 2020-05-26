package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("Abhishek");;
		driver.findElement(By.name("lastname")).sendKeys("Khaneja");
		Select drop=new Select(driver.findElement(By.id("continents")));
		
		drop.selectByVisibleText("Europe");
		Practiceexecution obj = new Practiceexecution();
		obj.radio("sex", "Male", driver);
		obj.radio("exp", "3", driver);
		obj.radio("profession", "Manual Tester", driver);
		obj.radio("tool", "QTP", driver);
		driver.findElement(By.id("datepicker")).sendKeys("21/10/2017");
		//driver.findElement(By.id("continents"))
		}
		
		
		

	}


