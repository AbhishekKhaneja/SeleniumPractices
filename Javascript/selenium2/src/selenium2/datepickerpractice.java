package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'6')]")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/dialog/default.html']")));
        
    
   String Q=	driver.findElement(By.xpath("//p[contains(text(),'This is the default dialog')]")).getText();
    System.out.println(Q);
		Thread.sleep(4000);
		driver.close();
		
	}

}
