package newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage extends Setup{

	
	By username = By.xpath("//input[@name='userName']");
	By password = By.xpath("//input[@name='password']");
	By signinbutton = By.xpath("//input[@name='login']");
	
//	public loginpage(WebDriver driver)
//	{
//		this.driver = driver;
//	}
	public void login(String UN,String PD)
	{
		driver.findElement(username).sendKeys(UN);
		driver.findElement(password).sendKeys(PD);
		driver.findElement(signinbutton).click();
	}
	 
	
	
}