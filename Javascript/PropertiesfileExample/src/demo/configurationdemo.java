package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class configurationdemo {
	
    @Test
	public void testconfig() throws Exception
	{
		Properties prop = new Properties();
		FileInputStream Stream = new FileInputStream("C:\\Users\\my\\workspace\\PropertiesfileExample\\src\\Config.properties");
		//second way
		//FileInputStream Stream = new FileInputStream("./Config.properties");
		prop.load(Stream);
		
	}
}
