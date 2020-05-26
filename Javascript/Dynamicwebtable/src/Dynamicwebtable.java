import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //fetch number of rows and columns from the dynamic table
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa");
		
	   System.out.println(driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th")).size());
	   
	  System.out.println(driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size());
	  
	 System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]")).getText());

	 // driver.close();
	}

}
