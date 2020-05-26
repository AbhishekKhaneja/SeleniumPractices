package selenium2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowstest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String Parenwin=driver.getWindowHandle();
		System.out.println(Parenwin);
		
		
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();	
		
	Set<String> allwin =driver.getWindowHandles();
	
	System.out.println(allwin);
	
	for(String temp : allwin)
	{
		
		if(!temp.equals(Parenwin))
		{
			driver.switchTo().window(temp);
			Thread.sleep(3000);
			driver.close();
		}
		
	}
		
		
	}

}
