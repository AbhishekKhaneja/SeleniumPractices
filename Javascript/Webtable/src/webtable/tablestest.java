package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//To Implicitly wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-table/");
	WebElement tbody =	driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody"));
	
	List<WebElement> trows=tbody.findElements(By.tagName("tr"));
	for(int i=0;i<trows.size();i++)
	{
		List<WebElement> tcells=trows.get(i).findElements(By.tagName("td"));
		
		for(int j=0;j<tcells.size();j++)
		{
			System.out.println(tcells.get(j).getText() + " ");
		}
		System.out.println();
	}
		
		

	}

}
