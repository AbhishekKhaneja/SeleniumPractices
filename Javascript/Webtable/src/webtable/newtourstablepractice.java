package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtourstablepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		  WebElement x=driver.findElement(By.name("userName"));
	       x.sendKeys("batman");
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("batman");
	       driver.findElement(By.xpath("//input[@name='login']")).click();
	       driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	      WebElement Tablebody= driver.findElement(By.xpath("//form[@name='results']//following::tbody"));
	      
	   List<WebElement> Allrows =   Tablebody.findElements(By.tagName("tr"));
	   
	  for(int i =0;i<Allrows.size();i++)
	  {
	List<WebElement> Allcells=  Allrows.get(i).findElements(By.tagName("td"));
	for(int j =0;j<Allcells.size();j++)
	{
		System.out.println(Allcells.get(j).getText());
		if(Allcells.get(j).getText().equals("Pangaea Airlines 362"))
		{
			Allcells.get(j-1).click();
		}
	}
	  }
		
		
	}

}
