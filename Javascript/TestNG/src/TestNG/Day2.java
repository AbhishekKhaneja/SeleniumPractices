package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void ploan()
	{
		Assert.assertTrue(false);
		System.out.println("Ploan");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("I will run at the last in this Test");
	}

}
