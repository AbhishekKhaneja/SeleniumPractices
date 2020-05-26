package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	
	@Parameters({"URL","KEY"})
	@Test
	public void WebloginCarloan(String Name,String KEY)
	{
	System.out.println("Weblogincarloan");
	System.out.println(Name);
	System.out.println(KEY);
	}
	@Test
	public void mobileloginCarloan()
	{
	System.out.println("Mobilelogincarloan");
	}
	
	@Test(dataProvider="getdata")
    public void loginAPIcgetdataarloan(String username,String password)
    {
		System.out.println("LoginAPIcarloan");
		System.out.println("Username: "+username+" Password:" +password);
    }
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0] ="Firstusername";
		data[0][1]="First password";
		
		data[1][0] ="Secondusername";
		data[1][1]="Secondpassword";
		
		
		data[2][0] ="Thirdusername";
		data[2][1]="Thirdpassword";
		
		
		return data;
	}
			}
