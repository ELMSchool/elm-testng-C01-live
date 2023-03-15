package testng_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Tests started...");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting test: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure: " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getName());
	}



	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Tests are finished" );
	}

	
	
}
