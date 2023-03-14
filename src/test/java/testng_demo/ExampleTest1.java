package testng_demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExampleTest1 {
	
	@BeforeSuite
	public void runBeforeSuit2() {
		
		System.out.println("Before suite 2");
		
	}
	
	@BeforeSuite
	public void runBeforeSuit1() {
		
		System.out.println("Before suite 1");
	}
	

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("before method 1");
	}
	
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("before method 2");

	}
	
	
	@Test(groups= {"smoke","reg"}, description = "Bla bla")
	public void testA() {
		
		System.out.println("Test A");
		
	}

	
	@Test
	public void testB() {
		System.out.println("Test B");
	}
	
	
	@Test(groups= {"smoke"})
	public void testC() {
	
		System.out.println("Test C");
	}
}
