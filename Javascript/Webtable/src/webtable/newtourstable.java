package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtourstable {

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
	WebElement Tbody = driver.findElement(By.xpath("//form[@name='results']//following::tbody"));
//	List<WebElement> Trows =Tbody.findElements(By.tagName("tr"));
//	for(int i=0;i<Trows.size();i++)
//	{
//		List<WebElement> tcells=Trows.get(i).findElements(By.tagName("td"));
//		
//		for(int j=0;j<tcells.size();j++)
//		{
//			System.out.println(tcells.get(j).getText());
//		if(	tcells.get(j).getText().contains("Pangaea Airlines 362"))
//		{
//				tcells.get(j-1).click();
//		}			
//		}
//
//	}
	
	List<WebElement> R=driver.findElements(By.tagName("tr"));
	
	for(int i =0;i<R.size();i++)
	{
	List<WebElement> Q =R.get(i).findElements(By.tagName("td"));
	
	for(int j =0;j<Q.size();j++)
	{
	if(Q.get(j).getText().equals("Pangaea Airlines 362"))
	{
		Q.get(j-1).click();
	}
	}
		
	}
	

	}

}
