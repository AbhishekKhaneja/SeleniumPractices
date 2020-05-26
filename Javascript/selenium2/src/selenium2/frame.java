package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/my/Desktop/frame.html");
// switching from page to frame-->>1st way using index---->>//	driver.switchTo().frame(0);
//2nd way using name of the frame---->>//driver.switchTo().frame("iframe2");
		//driver.findElement(By.name("userName")).sendKeys("batman");
	
	//3rd way using webelement 	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='400']")));
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='800']")));
		driver.findElement(By.name("userName")).sendKeys("batman");
	}

}
