package practiceseleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singlecheckboxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
	WebElement Q=	driver.findElement(By.xpath("//input[@id='isAgeSelected']//following::div"));
	
	if(Q.getText().equals("Success - Check box is checked"))
	{
		System.out.println("Testpassed");
	}
	else
	{
		System.out.println("TestFailed");
	}
	}

}
