package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://jqueryui.com/droppable/']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Thread.sleep(1000);
		
		Actions Action = new Actions(driver);
		
		//Action.moveToElement();
		Action.dragAndDrop(driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")),driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"))).build().perform();
		
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@href='https://jqueryui.com/menu/']")).click();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        Action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-9']"))).build().perform();
        
        Thread.sleep(3000); 
        Action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-10']"))).build().perform();
        Thread.sleep(3000);
        Action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-11']"))).click().build().perform();
        
        driver.switchTo().parentFrame();
        
        driver.findElement(By.xpath("//a[@href='https://jqueryui.com/slider/']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement Slider =    driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        Action.dragAndDropBy(Slider, 300, 0).build().perform();
        Thread.sleep(6000);
        
        Action.dragAndDropBy(Slider, -300, 0).build().perform();
      //  driver.close();
        
        // another way of doing it is there in this link:http://learnseleniumtesting.com/slide-bar-and-slide-action-using-webdriver/
	}

}
