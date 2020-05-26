/**
 * 
 */
package newtours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author my 
 * this page contains all the object of flight finder Page using Normal Approach
 */

public class flightfinderpage extends Setup{
	
		
	By triptype = By.xpath("//input[@name='tripType']");
	
//	public flightfinderpage(WebDriver driver)
//	{
//		this.driver = driver;
//	}

	public void findflightpage()
	{
	List<WebElement> List =	driver.findElements(triptype);
	
	for(int i =0 ;i<List.size();i++)
	{
		System.out.println("i came inside");
		if(List.get(i).getAttribute("value").equals("oneway"))
		{
			List.get(i).click();
		}
	}
	}
}
