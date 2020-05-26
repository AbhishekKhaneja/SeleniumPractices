package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablestest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		String A = driver.findElement(By.xpath("//h1[contains(text(),'Automation Practice Table')]")).getText();
        System.out.println(A);
        
//       List<WebElement> L = driver.findElements(By.tagName("th"));
//       for(WebElement J : L)
//       {
//    	   System.out.println(J.getText());
//       }
//       
//     WebElement TB=  driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr"));
//       
//  List<WebElement> Q=   TB.findElements(By.tagName("th"));
//      for(WebElement S : Q)
//      {
//    	 System.out.println(S.getText());
//      }
      
      WebElement TX=   driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody"));
      
     List<WebElement> TS= TX.findElements(By.tagName("tr"));
     
     for(WebElement I : TS)
     {
    	List<WebElement> TQ = I.findElements(By.tagName("td"));
    	
    	for(WebElement Y : TQ)
    	{
    		System.out.println(Y.getText());
    	}
    	
     }
     
      
      
        }

}
