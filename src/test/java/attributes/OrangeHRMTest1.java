package attributes;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Driver;

public class OrangeHRMTest1 {
	
	WebDriver driver;
	
	@DataProvider
	public Object[][] testDataProvider(){
		
		return new Object [] []{
			
			{"Admin", "admin123", true},
			{"elmadmin", "Elm1234!", false}
		};
		
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Setting driver...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing driver...");
		driver.close();
	}
	
	@Test(description = "Verifying login button is displayed", priority = 0)
	public void testLandOnLoginPage() {
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		assertTrue(loginButton.isDisplayed(), "Login button is not displayed!!!");
		
	}
	
	
	@Test(dataProvider = "testDataProvider",description = "Verify successful login and dashbord header text", priority = 1)
	
	public void testLoginWithValidCredentials(String username, String password) {
		WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameInputBox.sendKeys(username);
		passwordInputBox.sendKeys(password);
		loginButton.click();
		
		WebElement dashboardHeader = driver.findElement(By.tagName("h6"));
		assertEquals(dashboardHeader.getText(), "Dashboard");
		
	}
	
	@Test(description = "Verify successful login and dashbord header text", priority = 2)
	@Parameters({"invalidUsername", "invalidPassword"})
	public void testLoginWithInvalidCredentials(String username, String password) {
		WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameInputBox.sendKeys(username);
		passwordInputBox.sendKeys(password);
		loginButton.click();
		WebElement invalidCredentialsMessage = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
		
		assertEquals(invalidCredentialsMessage.getText(), "Invalid credentials");
		
	}
}
