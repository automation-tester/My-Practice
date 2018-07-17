package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@value='Log In']")
	public WebElement signInButton;
}
