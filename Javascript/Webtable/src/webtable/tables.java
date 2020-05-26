package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-table/");
	WebElement tbody =	driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody"));
	
	List<WebElement> L=tbody.findElements(By.tagName("tr"));
	
for(int i =0 ;i<L.size();i++)
{

List<WebElement> Q=	L.get(i).findElements(By.tagName("th"));
for(WebElement Temp: Q)
{
	System.out.println(Temp.getText());
}
}
//=	th.findElements(By.tagName("th"));
//
//for(WebElement temp : L)
//{
//	System.out.println(temp.getText());
//}
//}
	}
}

