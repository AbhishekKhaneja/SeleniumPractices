package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@name='firstname']//following::input")).sendKeys("khaneja");
		//driver.findElement(By.xpath("//input[@value='Female']")).click();
	//this way not working in radio button
//		driver.findElement(By.xpath("//input[@id='sex-1']//label[contains(text(),'Female')]")).click();
		//this way its working
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//input[@id='exp-0']//following::input[3]")).click();
		//driver.findElement(By.xpath("//input[contains(text(),)]"))
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("21/07/2017");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@id='tool-0']//following::input[2]")).click();
		driver.findElement(By.xpath("//select[@id='continents']//option[contains(text(),'Australia')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Button')]")).click();	
	}

}
