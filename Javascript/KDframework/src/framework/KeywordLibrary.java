package framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordLibrary {

	static WebDriver driver;
	static String Status;

	public static void RuntimeController(String MethodName, String P1, String P2, String P3)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Method methods = KeywordLibrary.class.getMethod(MethodName, String.class, String.class, String.class);
		methods.invoke(MethodName, P1, P2, P3);
	}

	public static void openBrowser(String P1, String P2, String P3) throws Exception {
		try {
			if (P1.equals("chrome"))
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get(P2);
			// System.out.println(P1);
			Status = "Pass";
		} catch (Exception e) {
			utilities.screens(driver, P1);
			System.out.println("Error while opening the browser");
		}
	}

	public static void Entertext(String P1, String P2, String P3) throws Exception {
		try {
			switch (P1) {
			case "name":
				driver.findElement(By.name(P2)).sendKeys(P3);
				break;
			case "id":
				driver.findElement(By.id(P2)).sendKeys(P3);
				break;
			case "xpath":
				driver.findElement(By.xpath(P2)).sendKeys(P3);
				break;

			}
			Status = "Pass";
		} catch (Exception e) {

			System.out.println("Error entering the text");
			utilities.screens(driver, P1);
			Status = "Fail";
		}

	}

	public static void Button(String P1, String P2, String P3) throws Exception {
		try {
			switch (P1) {
			case "name":
				driver.findElement(By.name(P2)).click();
				break;
			case "id":
				driver.findElement(By.id(P2)).click();
				break;
			case "xpath":
				driver.findElement(By.xpath(P2)).click();
				break;
			}
			Status = "Pass";
		} catch (Exception e) {
			System.out.println("Error clicking on the Button");
			utilities.screens(driver, P1);
			Status = "Fail";
		}
	}

	public static void Radio(String P1, String P2, String P3) throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> list = driver.findElements(By.name(P1));

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getAttribute(P2));
			}

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getAttribute(P2).equals(P3)) {
					System.out.println(list.get(i));
					list.get(i).click();
				}
			}
			Status = "Pass";
		} catch (Exception e) {

			System.out.println("Error in Radios");
			utilities.screens(driver, P1);
			Status = "Fail";
		}
	}

	public static void Select(String P1, String P2, String P3) throws Exception {

		try {
			WebElement A = driver.findElement(By.name(P1));

			org.openqa.selenium.support.ui.Select obj = new org.openqa.selenium.support.ui.Select(A);
			List<WebElement> Q = obj.getOptions();
			for (int i = 0; i < Q.size(); i++) {
				System.out.println(Q.get(i).getText());
			}

			for (int i = 0; i < Q.size(); i++) {

				if (Q.get(i).getText().equals(P2)) {
					System.out.println(Q.get(i));
					Q.get(i).click();
				}
			}
			Status = "Pass";
		} catch (Exception e) {
			System.out.println("Error in selecting the dropdown");
			utilities.screens(driver, P1);
			Status = "Fail";
		}
	}
}
