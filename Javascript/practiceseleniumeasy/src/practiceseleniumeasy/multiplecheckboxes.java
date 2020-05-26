package practiceseleniumeasy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplecheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		List<WebElement> Allcheckboxes  = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
for(WebElement temp : Allcheckboxes)
{
	temp.click();
	if(temp.isSelected())
	{
		

	}
}
	}

}
