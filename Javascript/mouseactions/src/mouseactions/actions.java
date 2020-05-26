package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\abhkhane\\Downloads\\chromedriver_win32\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://jqueryui.com/droppable/']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions actions = new Actions(driver);
		//actions.contextClick(driver.findElement(By.linkText("REGISTER"))).build().perform();

		actions.dragAndDrop(driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")),driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"))).build().perform();
		
	driver.switchTo().parentFrame();
	//driver.findElement(By.xpath(xpathExpression))
	driver.findElement(By.xpath("//a[@href='https://jqueryui.com/menu/']")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	actions.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-9']"))).build().perform();
	Thread.sleep(1000);
	actions.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-10']"))).build().perform();
    Thread.sleep(1000);
	actions.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-11']"))).click().build().perform();
		
		
	}

}
