package testng_assertions;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.Driver;

public class AssertDemo {
	
	@Test
	public void testValidLoginWithHardAssert() {
		
		Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actualTitle = Driver.getDriver().getTitle(); //OrangeHRM
		String expectedTitle = "OrangeHR";
		
		WebElement loginButton = Driver.getDriver().findElement(By.cssSelector("button[type='submit']")); //????
		
		String currentUrl = Driver.getDriver().getCurrentUrl();
		
		
		//staticly imported
		assertEquals(actualTitle, expectedTitle); //fail
		assertTrue(loginButton.isDisplayed()); //not executed
		assertTrue(currentUrl.endsWith("login")); //not executed
		System.out.println("Test finished!"); //not executed
		Driver.getDriver().close();
	}
	
	@Test
	public void testValidLoginWithSoftAssert() {
		
		SoftAssert softAssert = new SoftAssert();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "OrangeHR";
		
		WebElement loginButton = Driver.getDriver().findElement(By.cssSelector("button[type='submit']")); //????
		
		String currentUrl = Driver.getDriver().getCurrentUrl();
		
		
		
		softAssert.assertEquals(actualTitle, expectedTitle); //fail
		softAssert.assertTrue(false); //pass
		softAssert.assertTrue(currentUrl.endsWith("loin")); //pass
		
		System.out.println("Test finished!"); //executed
		softAssert.assertAll();
	}

}
