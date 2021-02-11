package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Languages {
	
	@Test(groups= {"Sanity"},dataProvider="fetchdata")
	public void english(String username,String password)
	{
		System.out.println("I like English");
		System.out.println(username+" "+password);
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"Smoke"})
	public void telugu()
	{
		System.out.println("Telugu is my mother tongue");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@DataProvider
	public Object[][] fetchdata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]= ("abc1");
		obj[0][1]=("123");
		obj[1][0]=("def2");
		obj[1][1]=("456");
		return obj;
	}

}
