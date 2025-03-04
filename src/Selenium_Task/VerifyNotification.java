package Selenium_Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class VerifyNotification {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 try {
	            driver.get("http://www.chaitanyacolleges.com/cgcstudent/index.php"); 
	            driver.findElement(By.name("admnno"));   
	            WebElement triggerElement = driver.findElement(By.xpath("//input[@type='submit']")); 
	            triggerElement.click();        
	            WebDriverWait wait = new WebDriverWait(driver, null);
	            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	            String alertText = alert.getText();    
	            String expectedMessage = "please fill out this field"; 
	            if (alertText.equals(expectedMessage)) {
	                System.out.println("Alert message is as expected: " + alertText);
	            } else {
	                System.out.println("Alert message is not as expected. Actual message: " + alertText);
	            }
	            alert.accept();   
	        } finally {
	            driver.quit();
	        }
	}
}


