package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(Driver.getDriver(),this);
	}

	
	@FindBy(id="email")
	WebElement emailInputBox;
	
	@FindBy(id="pass")
	WebElement passwordInputBox;
	
	@FindBy(id="send2")
	WebElement signInButton;
	
	
	
	public void loginToApp(String email, String password) {
		
		emailInputBox.sendKeys(email);
		passwordInputBox.sendKeys(password);
		signInButton.click();
	}
}
