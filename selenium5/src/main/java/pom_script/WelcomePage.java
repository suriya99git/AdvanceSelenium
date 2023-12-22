package pom_script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WelcomePage  {

	
	public WelcomePage(ChromeDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText = "Register")
	private WebElement registerbutton;
	
	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getCartbutton() {
		return cartbutton;
	}

	public WebElement getWishlistbutton() {
		return wishlistbutton;
	}
	@FindBy(linkText = "Log in")
	private WebElement loginbutton;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement cartbutton;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistbutton;
	
	
	
}
