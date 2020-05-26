package practiceseleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleinputfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();

	}

}
