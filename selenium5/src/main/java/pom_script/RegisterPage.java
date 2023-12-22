package pom_script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseTest;

public class RegisterPage  {
	
	
	public RegisterPage(ChromeDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "gender-male")
	private WebElement gender;
	@FindBy(id="FirstName")
	private WebElement firstname;
	public WebElement getGender() {
		return gender;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfpassword() {
		return confpassword;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(id="Email")
	private WebElement emailid;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="ConfirmPassword")
	private WebElement confpassword;
	@FindBy(id="register-button")
	private WebElement registerbutton;
	
}
