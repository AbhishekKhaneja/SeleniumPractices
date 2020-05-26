package selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
				

				WebDriver driver = new ChromeDriver();
				//To Implicitly wait 
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath(".//button[@class='_2AkmmA _29YdH8']")).click();
				driver.findElement(By.xpath("//input[@type='text' and @class='LM6RPg']")).sendKeys("Books");
				driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
				List<WebElement> Q=driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
				
				for(WebElement G : Q)
				{
					System.out.println(G.getText());
				}
			  List<WebElement> j	= driver.findElements(By.xpath("//a[@class='_2cLu-l']"));
			for(WebElement X : j)
			{
				System.out.println(X.getText());
			}
	}

}
