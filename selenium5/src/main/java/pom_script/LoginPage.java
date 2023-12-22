package pom_script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(ChromeDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Log in")
	private WebElement Loginbutton;
	
	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLogButton() {
		return LogButton;
	}
	@FindBy(id = "Email")
	private WebElement EmailTextField;
	
	@FindBy(id = "Password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "(//input[@Type='submit'])[2]")
	private WebElement LogButton;
	
}
