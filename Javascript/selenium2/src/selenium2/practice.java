package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//td[@width='112']//input")).sendKeys("batman");
		driver.findElement(By.xpath("//td[@width='112']//following::input[2]")).sendKeys("batman");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    //ist way driver.findElement(By.xpath("//input[@name='tripType' and @value ='oneway']//following::input")).click();
	 //2nd way   driver.findElement(By.xpath("//input[@name='tripType' and @value ='oneway']")).click();
		//3rd way  if oneway is not unique in the webpage then this below line would not have worked.
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//4th way but it is not working here in this case.
		//driver.findElement(By.xpath("//input[contains(text(),'One Way')]")).click();
	    	driver.findElement(By.xpath("//select[@name='passCount']//option[contains(text(),'3')]")).click();
	    	driver.findElement(By.xpath("//select[@name='fromPort']//following::option[2]")).click();
	    	driver.findElement(By.xpath("//select[@name='fromMonth']//option")).click();
	    	driver.findElement(By.xpath("//select[@name='fromDay']//option[2]")).click();
	    	driver.findElement(By.xpath("//input[@name='servClass']//following::input[2]")).click();
	    	//driver
		//driver.findElement(By.xpath("//select[@name=fromPort and]"))
	  //  practclass obj = new practclass();
	 //   obj.dropdown("passCount","2",driver);
	}

}
