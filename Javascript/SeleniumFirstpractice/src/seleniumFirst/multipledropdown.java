package seleniumFirst;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class multipledropdown {
	
	public void multiple(String P1,String P2,String P3,WebDriver driver)
	{ 
		WebElement obj = driver.findElement(By.xpath(P1));
		
		Select mul = new Select(obj);
		
		if(mul.isMultiple())
		{
		List<WebElement> L =	mul.getOptions();
		for(WebElement Temp : L)
		{
			if(Temp.getText().equals(P2) || Temp.getText().equals(P3))
			{
				Temp.click();
			}
		}
	
	}

}
}