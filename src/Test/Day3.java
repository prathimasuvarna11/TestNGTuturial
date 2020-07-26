package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(dataProvider = "getData" )
	public void WebLoginCarLoan(String username, String password)
	{
		System.out.println("WebLoginCarLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan");
		
	}
	@BeforeMethod
	public void executeBeforeMethod()
	{
		System.out.println("Execute before method");
	}
	
	@AfterMethod
	public void executeAfterMethod()
	{
		System.out.println("Execute after method");
	}
	
	@Test(enabled=false)
	public void MobileSigninCarLoan()
	{
		System.out.println("MobileSigninCarLoan");
	}
	@BeforeClass
	public void executeBeforeClass()
	{
		System.out.println("Execute before class");
	}
	
	@AfterClass
	public void executeAfterClass()
	{
		System.out.println("Execute after class");
	}
	
	
	@Test
	public void MobileSignoutCarLoan()
	{
		System.out.println("MobileSignoutCarLoan");
		
	}
	@Parameters({"URL","APIKey/Username"})
	@Test(groups= {"Smoke"})
	public void APILoginCarLoan(String urlName, String Key)
	{
		System.out.println("APILoginCarLoan");
		System.out.println(urlName);
		System.out.println(Key);
	}
	
	@DataProvider()
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="username1";
		data[0][1]="password1";
		
		data[1][0]="username2";
		data[1][1]="password2";
		
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
		
	}
	
	

}
