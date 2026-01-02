package pagepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

public class LoginPage extends Base {
	
	@FindBy(xpath = "//*[@id='user-name']") private WebElement UsernameInput;
	@FindBy(xpath = "//*[@id='password']") private WebElement PasswordInput;
	@FindBy(xpath = "//*[@id='login-button']") private WebElement LoginButton;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String loginsaucelab() {
		
		UsernameInput.sendKeys("standard_user");
		PasswordInput.sendKeys("secret_sauce");
		LoginButton.click();
		
        return driver.getTitle();

		
	
	}
	
	
	
	

}
