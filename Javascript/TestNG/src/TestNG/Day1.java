package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterSuite
	public void beforesuite()
	{
		System.out.println("I am the last");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will execute before every method in the Day1 class");
	}
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void secondtest()
	{
		System.out.println("Bie");
	}
	@BeforeTest
	public void Prerequisite()
	{
		System.out.println("I will run first in the Test");
	}
    @AfterMethod
    public void aftertest()
    {
    	System.out.println("I will execute after every method in day1 class");
    }
    @BeforeSuite
    public void Beforesuite()
    {
    	System.out.println("I am the number 1");
    }
}

