package practiceseleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twoinputfields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("10");
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
	}

}
