package seleniumFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipledropdownExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
	multipledropdown obj = new multipledropdown();
	obj.multiple("//select[@id='selenium_commands']","Switch Commands","Wait Commands",driver);
	}

}
