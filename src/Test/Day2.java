package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(timeOut=40000)
	public void Demo2()
	{
		System.out.println("Good");
	}
	
	@BeforeSuite
	public void executeBeforeSuite()
	{
		System.out.println("Execute before suite");
	}

}
