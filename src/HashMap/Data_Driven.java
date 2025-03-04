package HashMap;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driven {
	public class DataDrivenTest {
	    public static void main(String[] args) throws IOException {
	   Map<String, String> testData = ExcelReaderUtil.readExcel("Test2.xlsx", 0);
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://example.com/login");

	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement emailField = driver.findElement(By.id("email"));
	        WebElement submitButton = driver.findElement(By.id("submit"));

	        usernameField.sendKeys(testData.get("username"));
	        passwordField.sendKeys(testData.get("password"));
	        emailField.sendKeys(testData.get("email"));
	        
	        submitButton.click();


	        try {
	            Thread.sleep(3000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        driver.quit();
	    }
}
}
