package restapi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testbase {

	public Properties prop;
	public Testbase() throws FileNotFoundException {
		prop= new Properties();
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
