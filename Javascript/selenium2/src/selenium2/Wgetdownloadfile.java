package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wgetdownloadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/test/yahoo.html");
			
			
	String href = driver.findElement(By.id("messenger-download")).getAttribute("href");
	
	String wgetcommmand = "cmd /c C:\\Wget\\wget.exe -P E: --no-check-certificate " + href;
	
	try{
		Process exec = Runtime.getRuntime().exec(wgetcommmand);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        } catch (Exception ex) {
        System.out.println(ex.toString());
        }
        driver.close();
        }
			

	}


