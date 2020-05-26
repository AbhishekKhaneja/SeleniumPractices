package selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/my/Desktop/.html");
		driver.findElement(By.name("test")).click();
		Alert alert=driver.switchTo().alert();
		
		if(alert.getText().equals("I am Alert!"))
		{
			Thread.sleep(3000);
			alert.accept();
		}
		
	//	alert.dismiss();
		
	}

}
