package practiceseleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Csseelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		//Explicitwait
		WebDriverWait wait1 = new WebDriverWait(driver ,10);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("google"))));
		
		
		driver.switchTo().frame(0);
		//driver.findElement(By.cssSelector("input#datepicker")).click();
		//driver.findElement(By.cssSelector("input.hasDatepicker")).click();
		//driver.findElement(By.cssSelector("input#datepicker[class='hasDatepicker']")).click();
		driver.findElement(By.cssSelector("input#datepicker[type='text']")).click();
	

	}

}
