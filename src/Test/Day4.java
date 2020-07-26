package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@AfterTest
	public void executeLast()
	{
		System.out.println("Execute last");
	}
	
	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileLoginHommeLoan(String urlName)
	{
		System.out.println("MobileLoginHomeLoan");
		System.out.println(urlName);
	}
	
	@Test(dependsOnMethods= {"MobileLoginHommeLoan","WebLoginHomeLoan"})
	public void APILoginHomeLoan()
	{
		System.out.println("APILoginHomeLoan");
	}

}
