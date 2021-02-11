package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Subjects {
	
	@Test(groups= {"Sanity"},dependsOnMethods= {"social"})
	public void maths()
	{
		System.out.println("Maths is my favourite subject");
	}
	
	@Test(groups= {"Regression"},enabled=true)
	public void science()
	{
		System.out.println("Science is imagination");
	}
	
	@Test(groups= {"Smoke"})
	public void social()
	{
		System.out.println("Social is very vast subject");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}


}
