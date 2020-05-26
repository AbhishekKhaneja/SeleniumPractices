package framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordLibrary2 {

	static WebDriver driver;

	public static void controller(String MethodName, String P1, String P2, String P3) throws NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method methods = KeywordLibrary2.class.getMethod(MethodName, String.class, String.class, String.class);
		methods.invoke(MethodName, P1, P2, P3);
	}

	public static void OOpenBrowser(String P1, String P2, String P3) {
		if (P1.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(P2);
		}
	}

	public static void EnterText(String P1, String P2, String P3) {
		switch (P1) {

		case "name":driver.findElement(By.name(P2)).sendKeys(P3);

		}
	}
	
	public static void button(String P1, String P2, String P3) {

	}

}
