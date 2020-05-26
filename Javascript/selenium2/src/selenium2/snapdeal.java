package selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		//Thread.sleep(10000);
		//driver.switchTo().alert();
//		Thread.sleep(40);
//		driver.findElement(By.xpath("//div[@id=desktopBannerWrapped']//following::button[contains(text(),'Not Now')]")).click();
//	
		//Thread.sleep(4
		List<WebElement> Q= null;
		
	//	driver.findElement(By.xpath("//button[contains(text(),'Allow')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
		driver.findElement(By.name("keyword")).sendKeys("Books");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']//following::span[(contains(text(),Search))]")).click();
		
		 Q=	driver.findElements(By.xpath("//span[contains(text(),'Rs. ')]"));
		
		
	for(WebElement P : Q)
	{	
		System.out.println(P.getText());
		
	}
	
	List<WebElement> J=driver.findElements(By.xpath("//p[@class='product-title']"));
	
	for(WebElement S : J)
	{
		System.out.println(S.getText());
	}
		
		//driver.findElement(By.xpath("//input[@name='firstname']//following::input")).sendKeys("khaneja");
				
		driver.close();		//driver.findElement(By.xpath("//select[@id='continents']//option[contains(text(),'Australia')]")).click();

	}
	

}
