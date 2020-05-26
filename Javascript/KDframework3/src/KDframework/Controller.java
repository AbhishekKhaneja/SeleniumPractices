package KDframework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Controller {
	 static WebDriver driver;
	 //static String Status;
	public static String Status;
	
	public static void runtimeController(String MethodName,String P1,String P2,String P3) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Method Method = Controller.class.getMethod(MethodName, String.class, String.class, String.class);
		Method.invoke(MethodName,P1,P2,P3);
			
	}

	public static void OpenBrowser(String P1, String P2,String P3) {
		try{
		
		switch (P1) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(P2);
			break;
		case "FireFox":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.get(P2);
		}
		Status="Pass";
		}
		catch(Exception e)
		{
			e.getMessage();
			Status="Fail";
		}
	}

	public static void TextBox(String P1, String P2, String P3) {
		
		try
		{
			switch (P1) {

		case "Name":
			driver.findElement(By.name(P2)).sendKeys(P3);
			break;
		case "Id":
			driver.findElement(By.name(P2)).sendKeys(P3);
			break;
		case "xpath":
			driver.findElement(By.xpath(P2)).sendKeys(P3);

		}
			Status="Pass";
		}
		catch(Exception e)
		{
			e.getMessage();
			Status ="Fail";
		}
	}

	public static void Click(String P1, String P2, String P3) {
		try{
			
		switch (P1) {

		case "Name":
			driver.findElement(By.name(P2)).click();
			break;
		case "Id":
			driver.findElement(By.name(P2)).click();
			break;
		case "xpath":
			driver.findElement(By.xpath(P2)).click();

		}
		Status= "Pass";
		}
		catch(Exception e)
		{
			e.getMessage();
			Status ="Fail";
		}

	}
}
