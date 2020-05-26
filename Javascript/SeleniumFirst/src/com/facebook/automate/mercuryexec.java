package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class mercuryexec {
	
	
	

	public void method(String name,String p,WebDriver driver)
	{
        WebElement drop= driver.findElement(By.name(name));
        System.out.println(drop);
      
      
      Select obj = new Select(drop);
      
      List<WebElement> options = obj.getOptions();
      
      System.out.println(options.size());
      
      for(int i =0;i<options.size();i++)
      {
   	   System.out.println(options.get(i).getText());
   	  }
      for(int i =0;i<options.size();i++)
      {
   	   if(options.get(i).getText().equals(p))
   	   {
   		   options.get(i).click();
   	   }
   	   
   	   
      }
   //  obj.selectByIndex(2);//first method to select something from the dropdownlistt
 //   obj.selectByValue("3");//Second method to select something from the dropdownlist
 //     obj.selectByVisibleText("March");//Third method to select something from the dropdownlis
      

}
}
