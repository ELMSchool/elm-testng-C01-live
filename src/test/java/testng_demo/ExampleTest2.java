package testng_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExampleTest2 {
	@BeforeSuite
	public void runBeforeSuite() {
		
		System.out.println("Before Suit");
		
	}
	
	@BeforeClass
	public void reunBeforeClass() {
		
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void runAfterClass() {
		
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void runBeforeMethod(){
		
		System.out.println("Before each test method");
	}
	
	@AfterMethod
	public void runAfterMethod() {
		
		System.out.println("After each test method");
	}
	@Test
	public void testD() {
		
		System.out.println("Test D");
		
	}

	
	@Test(groups= {"smoke"})
	public void testE() {
		System.out.println("Test E");
	}
	
	
	@Test
	public void testF() {
	
		System.out.println("Test F");
	}

}
