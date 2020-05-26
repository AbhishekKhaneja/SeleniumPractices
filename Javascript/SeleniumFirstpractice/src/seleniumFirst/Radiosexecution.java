package seleniumFirst;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiosexecution {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		Radios obj = new Radios();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		HashMap<Integer,ArrayList<String>> map=obj.excelcomm();
		System.out.println(map);
	    
		for(int i=0;i<map.size();i++)
		{
			ArrayList<String> list = new ArrayList<String>();
		    list = map.get(i);
		    System.out.println(list);
		
		
		}
		obj.login("//html//*[@name='userName']","//html//*[@name='password']","//html//*[@name='login']",driver);
		
		Thread.sleep(2000);
		obj.Radio("//input[@name='tripType']","value","oneway",driver);
		obj.dropdown("//html//*[@name='fromPort']","London",driver);
	
		
	
        
	

}
}
