package rummycircle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\abhkhane\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rummycircle.com/");
//		driver.findElement(By.xpath("//input[@id='reg_username_desktop']")).sendKeys("Abhishek");
//		driver.findElement(By.xpath("//input[@id='reg_password_desktop']")).sendKeys("Khaneja");
//		driver.findElement(By.xpath("//input[@id='reg_email_desktop']")).sendKeys("abby.khaneja@gmail.com");
//		driver.findElement(By.id("reg_year_desktop"));
//	
//	WebElement Year =	driver.findElement(By.xpath("//select[@id='reg_year_desktop']"));
//		WebElement Gender =	driver.findElement(By.xpath("//select[@id='reg_gender_desktop']"));
//	WebElement State =	driver.findElement(By.xpath("//select[@id='reg_state_desktop']"));
//	
//		
//		
//		Select obj = new Select(Year);
//		
//	obj.selectByVisibleText("1994");
//	Select obj1 = new Select(Gender);
//	
//	obj1.selectByVisibleText("Male");
//	
//	
//	Select obj3 = new Select(State);
//	
//obj3.selectByVisibleText("Assam");
//
//driver.findElement(By.xpath("//button[@id='btn_register_desktop']")).click();
		String Parenwin=driver.getWindowHandle();
driver.findElement(By.xpath("//input[@id='lw_username']")).sendKeys("abby.khaneja@gmail.com");
driver.findElement(By.xpath("//input[@id='lw_password']")).sendKeys("Khaneja");

driver.findElement(By.xpath("//span[@id='lw_submitbtn_span']")).click();
Thread.sleep(15000);
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='oauth2relay858672936']")));
driver.findElement(By.xpath("//img[@src='https://rcmg.in/mobile/images/close.png']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("//span[@class='addcash_tophead']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@id='agt-customAmount']")).sendKeys("1000");
driver.findElement(By.xpath("//span[@class='acgtw-fusion_choose_amtcustom_boxsection']//following::div")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//img[@id='agt-addCash4_img' and @src='https://rcmg.in/fusion/images/paytm_lhs_menu.png']")).click();
driver.findElement(By.xpath("//input[@id='agt-submitButtonImagePAYTM']")).click();
Thread.sleep(15000);
driver.findElement(By.xpath("//input[@class='pb-14 hideInputWithPlaceholder ng-touched ng-dirty ng-invalid ng-invalid-parse']")).click();
driver.findElement(By.xpath("//input[@class='pb-14 hideInputWithPlaceholder ng-touched ng-dirty ng-invalid ng-invalid-parse']")).sendKeys("89898989898");

driver.findElement(By.xpath("//a[@class='closePop close-modal']")).click();
//driver.findElement(By.xpath("//"))



	
}
}


