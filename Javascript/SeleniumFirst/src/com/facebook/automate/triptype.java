package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class triptype {

	public void trip(String triptype,String value,WebDriver driver)
	{
      List<WebElement> j= driver.findElements(By.name(triptype));
	      
	      for(int i=0;i<j.size();i++)
	      {
	    	  System.out.println(j.get(i).getAttribute("value"));
	    	  if(j.get(i).getAttribute("value").equals(value))
	    	  {
	    		  j.get(i).click();
	    	  }
	      }
	}
	
}
