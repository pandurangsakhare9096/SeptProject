package testpacakge;
import org.testng.Assert;
import org.testng.annotations.Test;
import basepackage.Base;
import pagepackage.LoginPage;

public class LoginPageTestClass extends Base {
	
	@Test
	public void loginsaucelabtest() {
		
		LoginPage loginpage = new LoginPage();
		
		String actualTitle =loginpage.loginsaucelab();
		
		String expectedTitle = "Swag Labs";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		
		
	}
	
	
	}
	

