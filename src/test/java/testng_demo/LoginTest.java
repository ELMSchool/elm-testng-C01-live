package testng_demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class LoginTest {
	
	@Test
	public void testLoginWithValidCredentials() {
		Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
		
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		
		
		homePage.signInLink.click();
		loginPage.loginToApp(ConfigReader.getPropertyValue("email"), ConfigReader.getPropertyValue("password"));
		
		assertEquals(homePage.loggedInMessage.getText(), "Welcome, Test Test!");
		
	}

}
