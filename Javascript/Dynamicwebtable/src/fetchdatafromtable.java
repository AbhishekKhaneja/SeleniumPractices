import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchdatafromtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/table.html");
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		//driver.findElements(By.xpath("/html/body/table/tbody"))
		for(int i=0;i<rows.size();i++)
		{
		List<WebElement> columns =	rows.get(i).findElements(By.tagName("td"));
		int columnsize =  columns.size();
		
		for(int j=0;j<columnsize;j++)
		{
		
			String Celltext=columns.get(j).getText();
			System.out.println("Row number "+ i +"Column number "+ j +" data = "+Celltext);
			
		}
		
		
		}
		
		

	}

}
