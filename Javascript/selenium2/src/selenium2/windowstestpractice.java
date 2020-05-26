package selenium2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowstestpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// To Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		String Parenwin = driver.getWindowHandle();
		System.out.println(Parenwin);
		
		

		driver.findElement(By.xpath("//button[@id='button1']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();

		
		
		//Set<String> S = 
//System.out.println(S);
		for (String Temp : driver.getWindowHandles()) {
			System.out.println(Temp);
			if (!Temp.equals(Parenwin)) {
				driver.switchTo().window(Temp);
				Thread.sleep(5000);
				driver.close();
			}
		}

	}

}
