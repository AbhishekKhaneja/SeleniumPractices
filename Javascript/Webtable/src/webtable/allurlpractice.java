package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allurlpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		

		List<WebElement> Q =driver.findElements(By.tagName("a"));
		
		for(WebElement P : Q)
		{
			System.out.println(P.getText()+":"+P.getAttribute("href"));
		}
		
	}

}
