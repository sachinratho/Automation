package VelocityChinchwadEve.Aug21mavenprojects;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TESTNGAnnotaions {
	
	@BeforeSuite
	public void beforeSuite () {
		System.out.println("before suit is running");
		
	}
	@AfterSuite
	public void beforesuite() {
		System.out.println("after suit is running");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test suit is running");
		
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test is running");
	}
	@BeforeClass
     public void beforeclass() {
		System.out.println("before class is running");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class is running");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method is running");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method is running");
	}
	@Test
	public void test1() {
		System.out.println("test1  is running");
	}
	@Test
	public void test2() {
		System.out.println("test2  is running");
	
	
}}
