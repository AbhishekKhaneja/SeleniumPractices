package KDframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilities {
	
	public void Screenshot(WebDriver driver,String FileName) throws IOException
	{
	File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\my\\Desktop\\ScreenShot\\"+FileName+".png"));
	}

}
