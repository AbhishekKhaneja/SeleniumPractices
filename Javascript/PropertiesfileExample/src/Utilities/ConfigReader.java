package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	public ConfigReader()
	{
		prop = new Properties();
		FileInputStream Stream;
		try {
			Stream = new FileInputStream("C:\\Users\\my\\workspace\\PropertiesfileExample\\src\\Config.properties");
			prop.load(Stream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is == "+e.getMessage());
		}
	}
public String getChromePath()
{
	return prop.getProperty("ChromePath");
}
public String getURL()
{
	return prop.getProperty("URL");
		//second way
		//FileInputStream Stream = new FileInputStream("./Config.properties");
		
	}

}
