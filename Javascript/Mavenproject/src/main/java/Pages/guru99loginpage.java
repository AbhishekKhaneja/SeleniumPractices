package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class guru99loginpage {

	
		WebDriver driver;
		By username = By.name("uid");
		By Password = By.name("password");
		By loginbutton = By.name("btnLogin");
		By titletext = By.className("barone");

	
	
	public guru99loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void setusername(String strusername)
	{
		driver.findElement(username).sendKeys(strusername);
	} 
	public void setpassword(String strpassword)
	{
		driver.findElement(Password).sendKeys(strpassword);
	}
	public void logine()
	{
		driver.findElement(loginbutton).click();
	}
	public String titletest()
	{
		return driver.findElement(titletext).getText();
	}
	
	public void login(String StrUsername,String Password)
	{
		this.setusername(StrUsername);
		this.setpassword(Password);
		this.logine();
	}
}

