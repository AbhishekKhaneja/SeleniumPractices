package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//input[@name='userName']//following::input")).sendKeys("batman");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("batman");
		driver.findElement(By.xpath("//input[@name='userName']//following::input[2]")).click();
		//driver.findElement(By.xpath("//input[@name='tripType']//following::input")).click();
	//Istway//
		driver.findElement(By.xpath("//select[@name='fromPort']//following::option[@value='London']")).click();
		//2ndway//
		driver.findElement(By.xpath("//option[@value='Frankfurt']")).click();
		driver.findElement(By.xpath("//select[@name='fromPort']//following::option[contains(text(),'Paris')]")).click();
		driver.findElement(By.xpath("//input[@name='tripType']//following::input[contains(text(),'One Way')]")).click();
	}

}
