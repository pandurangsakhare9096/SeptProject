package basepackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	protected static WebDriver driver;
	
	@BeforeMethod
	
	public static void InitializeBrowser() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void tearDown () throws InterruptedException {
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.CANCEL).perform();
		driver.quit();

}
}
