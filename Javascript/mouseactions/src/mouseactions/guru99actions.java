package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class guru99actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		WebElement Downloadnow =driver.findElement(By.xpath("//a[contains(text(),'Download now')]"));
		
		Actions Action = new Actions(driver);
		Action.moveToElement(Downloadnow).build().perform();
		System.out.println(driver.findElement(By.xpath("//*[@class='box']/div/a")).getText());
		
		
		//What's new in 3.2
		
		

	}

}
