package testpacakge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.Base;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class HomePageTestClass extends Base {
	
	@Test
	public void homePageTest() {
	

	LoginPage login = new LoginPage();
	login.loginsaucelab();
	
	HomePage home = new HomePage();
	home.openHumbergerMenu();
	
	
	List<String> expectedMenus = Arrays.asList( 
			"All Items",
			"About",
			"Logout",
			"Reset App State");
	
	
	List<String> actualMenus = home.getMenuItems()
	        .stream()
	        .map(WebElement::getText)
	        .collect(Collectors.toList());

	Assert.assertEquals(actualMenus, expectedMenus);

}
	
	
}

