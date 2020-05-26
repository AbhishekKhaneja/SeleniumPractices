package javascriptExecutorvideo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class videoplay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhkhane\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3.org/2010/05/video/mediaevents.html");
		driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("document.getElementById(\"video\").play()");
		Thread.sleep(20000);
		js.executeScript("document.getElementById('video').pause()");
		

	}

}
