package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {
	
	@AfterSuite
	public void executeAfterSuite()
	{
		System.out.println("Execute after suite");
	}

	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"Smoke"})
	public void Demo1()
	{
		System.out.println("Bye");
	}
	
	@BeforeTest
	public void executeFirst()
	{
		System.out.println("Execute first");
	}
}
