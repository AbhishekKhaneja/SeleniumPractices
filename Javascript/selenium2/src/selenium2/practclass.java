package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practclass {

	
	public void dropdown(String P1,String P2,WebDriver driver)
	{
		
		driver.findElement(By.xpath("//select[@name=(P1)]//following::option[contains(text(),P2)]")).click();
	}
}
