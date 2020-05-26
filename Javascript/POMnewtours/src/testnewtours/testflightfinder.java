package testnewtours;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import newtours.Setup;
import newtours.flightfinderpage;

public class testflightfinder extends Setup{
	

	
	@Test
	public void flightfinder()
	{
    flightfinderpage obj1 = new flightfinderpage();
	obj1.up();
	obj1.findflightpage();
	}
}
