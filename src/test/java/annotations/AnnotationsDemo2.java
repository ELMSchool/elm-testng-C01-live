package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("Before method");	
//	}
	
	@Test(groups = {"demo2"})
	public void testMethodD() {
		
		System.out.println("D");
	}
	
	@Test(groups = {"demo1"})
	public void testMethodE() {
		System.out.println("E");
	}
	
	@Test(groups = {"demo2"})
	public void testMethodF() {
		System.out.println("F");
	}

}
