package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practiceexecution {

	public void radio(String name,String value,WebDriver driver)
	{
	List<WebElement> Q=driver.findElements(By.name(name));
	 
	for(int i=0;i<Q.size();i++)
	{
		System.out.println(Q.get(i).getAttribute("value"));
		if(Q.get(i).getAttribute("value").equals(value))
		{
			Q.get(i).click();
		}
		
	
}
	}
}
