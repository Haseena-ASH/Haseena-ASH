package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAutomation {
	 private static HashMap<String, String> expectedErrorMessages = new HashMap<>();

	    static {
	        expectedErrorMessages.put("invalid_login", "Invalid username or password.");
	        expectedErrorMessages.put("missing_username", "Username is required.");
	        expectedErrorMessages.put("missing_password", "Password is required.");
	        expectedErrorMessages.put("username_too_short", "Username must be at least 6 characters.");
	        expectedErrorMessages.put("password_too_short", "Password must be at least 8 characters.");
	    }

	    public static String getExpectedErrorMessage(String scenarioKey) {
	        return expectedErrorMessages.get(scenarioKey);
	    }

	    public static String getActualErrorMessage(WebDriver driver) {
	        WebElement errorMessageElement = driver.findElement(By.className("error-message"));
	        return errorMessageElement.getText();
	    }

	    public static boolean compareErrorMessages(WebDriver driver, String scenarioKey) {
	        String expectedMessage = getExpectedErrorMessage(scenarioKey);
	        String actualMessage = getActualErrorMessage(driver);

	        System.out.println("Expected Message: " + expectedMessage);
	        System.out.println("Actual Message: " + actualMessage);

	        return expectedMessage.equals(actualMessage);
	    }

	    public static void main(String[] args) {
	      
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.facebook.com/");
	        WebElement usernameField = driver.findElement(By.xpath("//input[@name='email']"));
	        
	        WebElement passwordField = driver.findElement(By.xpath("//input[@name='pass']"));
	        WebElement submitButton = driver.findElement(By.xpath("//button[@name='login']"));

	        usernameField.sendKeys("Hasee");
	        passwordField.sendKeys("4226");
	        submitButton.click();

	        if (compareErrorMessages(driver, "invalid_login")) {
	            System.out.println("Test Passed: Error message matched.");
	        } else {
	            System.out.println("Test Failed: Error message did not match.");
	        }

	        usernameField.clear();
	        passwordField.sendKeys("validPassword");
	        submitButton.click();

	        if (compareErrorMessages(driver, "missing_username")) {
	            System.out.println("Test Passed: Error message matched.");
	        } else {
	            System.out.println("Test Failed: Error message did not match.");
	        }

	        driver.quit();
	    }
}
