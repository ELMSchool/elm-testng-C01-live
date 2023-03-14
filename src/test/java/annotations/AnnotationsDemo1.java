package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {

//	@BeforeSuite
//	public void beforeSuite() {
//		
//		System.out.println("Before Suite");
//	}
//	
//	@AfterSuite
//	public void afterSuite() {
//		
//		System.out.println("After Suite");
//	}
//	
//	@BeforeTest
//	public void beforeTest() {
//		
//		System.out.println("Before Test");
//	}
//	
//	@AfterTest
//	public void afterTest() {
//		System.out.println("After Test");
//		
//	}
//	

//	@BeforeClass
//	public void beforeClass1() {
//		
//		System.out.println("Before Class Demo1");
//	}
//	
//	@AfterClass
//	public void afterClass1() {
//		System.out.println("After Class Demo1");
//	}

//	@BeforeGroups("demo1")  //group demo1 - A, C, E
//							//group demo2 - B, D, F
//	public void beforeGroups1() {
//		
//		System.out.println("Before Demo 1 group");
//	}
//	
//	@BeforeGroups("demo2")
//	public void beforeGroups2() {
//		
//		System.out.println("Before Demo 2 group");
//	}
//	
//	
//	@AfterGroups("demo1")
//	public void afterGroups1() {
//		
//		System.out.println("After Demo 1 gorup");
//	}
//	
//	@AfterGroups("demo2")
//	public void afterGroups2() {
//		
//		System.out.println("After Demo 2 gorup");
//	}
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("Before method");	
//	}

	@Test(description = "Verify A is there", priority = 1, enabled = true, groups = { "a", "b" }, timeOut = 5500)
	public void testMethodA() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("A");
	}

	@Test(description = "Verify B is there", priority = 2, enabled = true)
	public void testMethodB() {
		System.out.println("B");
	}

	@Test(description = "Verify C is there", priority = 3, enabled = true)
	public void testMethodC() {
		System.out.println("C");
	}

}
