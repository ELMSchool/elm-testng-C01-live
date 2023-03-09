package testng_demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleTest1 {
	

	
	@Test(groups= {"smoke","reg"})
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
