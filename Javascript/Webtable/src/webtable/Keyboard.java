package webtable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		//Scrolling down
		JavascriptExecutor js = (JavascriptExecutor)(driver);//this is typecasting javascriptExecutor is a interface //javascriptexecutor class has the declaration(abstract classes) but driver class has the defination
		js.executeScript("scrollTo(0,4500)");
		
		//Taking Screenshot nand saving it on the system
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//File is a class present in java.io library//This is also typecasting TakesScreenShot is a interface that has declaration but driver class has the defination(means implementing the class)
		FileUtils.copyFile(file, new File("C:\\Users\\my\\Downloads\\jerry.png"));//this is a format please learn it
		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.linkText("REGISTER"))).build().perform();
		
		Robot robot = new Robot();//Robot is used to perform actions on the webpage using keyboard it has a limitation that it lost focus easily which means driver should only focus on the webpage which is crrently controlled by the driver.if you switch other window then it will perform action on the swtiched window.
		{
			for(int i =0;i<3;i++)
			{
		
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

}
