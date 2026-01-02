package testpacakge;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;

public class LoginPageViaexcel {

    public static void main(String[] args) throws Exception {
        // Excel File Path
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\USER\\Desktop\\excelpath.xlsx"));
        
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0); // First sheet

        // Example: Read first row (row 1, skipping header)
        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.saucedemo.com");
        driver.get("https://www.meesho.com/");
        // ✅ Corrected XPaths
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='login-button']")).click();

        Thread.sleep(5000);

        wb.close();
        fis.close();
        driver.quit();
    }
}
