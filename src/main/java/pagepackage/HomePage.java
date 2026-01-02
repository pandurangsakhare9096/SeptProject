package pagepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.Base;


public class HomePage extends Base {
 
	@FindBy(xpath = "//button [@id = 'react-burger-menu-btn']")
	private WebElement menuButton;
	
	@FindBy(css = "nav.bm-item-list a")
	private List <WebElement> menuItems;
	
	
	
	public HomePage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void openHumbergerMenu() {
		menuButton.click();
		
	}
	
	public List<WebElement> getMenuItems() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(menuItems));
		    
		return menuItems;
		
	}
}

