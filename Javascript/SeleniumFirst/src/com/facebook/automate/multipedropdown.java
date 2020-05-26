package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		multipleexec obj = new multipleexec();
		obj.multiple("selenium_commands","Navigation Commands", driver);
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://toolsqa.com/automation-practice-form/");
//		,
//		WebElement Y = driver.findElement(By.id("selenium_commands"));
//
//		
//		Select obj = new Select(Y);
//		if(obj.isMultiple())
//		{
//			System.out.println("It is multiple");
//			
//		}
//		obj.selectByIndex(3);
//		obj.selectByIndex(2);
//		obj.selectByVisibleText("WebElement Commands");
//		
//		System.out.println(obj.getFirstSelectedOption().getText());
//		
//		List<WebElement> list =obj.getOptions();
//		
//		for(int i =0;i<list.size();i++)
//		{
//			System.out.println(list.get(i).getText());
//		}
		
//		List<WebElement> All = obj.getAllSelectedOptions();
//		
//		for(WebElement temp : All)
//		{
//			System.out.println(temp.getText());
//			
//		}
//				
//		obj.deselectByVisibleText("WebElement Commands");
	}

}
