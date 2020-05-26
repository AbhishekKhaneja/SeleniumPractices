package seleniumFirst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.google.common.net.HostSpecifier;

public class Radios {
	
	public void login(String P1,String P2,String P3,WebDriver driver)
	{
	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(P1)).sendKeys("batman");
		driver.findElement(By.xpath(P2)).sendKeys("batman");
		driver.findElement(By.xpath(P3)).click();
		
	}
	
	public void Radio(String P1,String P2,String P3,WebDriver driver)
	{
		List<WebElement> radios = driver.findElements(By.xpath(P1));
		
		for(WebElement temp : radios)
		{
			if(temp.getAttribute(P2).equals(P3))
			{
				temp.click();
			}
		}
	}

	public void dropdown(String P1,String P2,WebDriver driver)
	{
		WebElement Drop = driver.findElement(By.xpath(P1));
		Select d = new Select(Drop);
		List<WebElement> l=d.getOptions();
		for(WebElement Temp : l)
		{
			if(Temp.getText().equals(P2))
					{
				Temp.click();
					}
		}
	}
			
	
	
	public HashMap<Integer,ArrayList<String>> excelcomm() throws IOException
	{
		HashMap<Integer,ArrayList<String>> Map = new HashMap<Integer,ArrayList<String>>();
		
		File file = new File("C:\\Users\\my\\Desktop\\Testdata.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook Workbook = new HSSFWorkbook(stream);
		HSSFSheet Sheet = Workbook.getSheet("Sheet1");
		
		for(int i =0;i<=Sheet.getLastRowNum();i++)
		{
			ArrayList<String> list = new ArrayList<String>();
		HSSFRow Row = Sheet.getRow(i);
		for(int j =0;j<Row.getLastCellNum();j++)
		{
			HSSFCell cell = Row.getCell(j);
			list.add(cell.getStringCellValue());
		}
		Map.put(i, list);
		}
		System.out.println(Map);
		return (Map);
		
	}

}
