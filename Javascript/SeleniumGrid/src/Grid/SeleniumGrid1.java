package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class SeleniumGrid1 {
	@Test
	public void Test2() throws MalformedURLException
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\my\\geckodriver.exe");	
	WebDriver driver1 = new RemoteWebDriver(new URL("http://localhost:7777/wd/hub"),
			DesiredCapabilities.firefox());
	driver1.get("http://newtours.demoaut.com/");
}
}

