package pagepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
 
	@findBy(xpath = "//button [@id = 'react-burger-menu-btn']")
	private WebElement menubutton;
}
