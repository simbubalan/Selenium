package sample;

import org.testng.annotations.*;

public class Testng {

	
	@BeforeTest
	public void testCase2()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void testCase3()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void testCase4()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void testCase5()
	{
		System.out.println("After Class");
	}
	@BeforeSuite
	public void testCase6()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void testCase7()
	{
		System.out.println("After Suite");
	}
	@BeforeMethod
	public void testCase8()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void testCase9()
	{
		System.out.println("After Method");
	}
	@Test (priority = 0)
	public void testCase10()
	{
		System.out.println("Test case with Priority=0");
	}
	@Test ()
	public void testCase1()
	{
		System.out.println("Test case # 1 with no Priority");
	}
}
