package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Login_Credentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Map<String, String> credentials = new HashMap<>();
		credentials.put("user1", "Hasee");
		credentials.put("user2", "HH");
		credentials.put("user3", "ash");

		for (Map.Entry<String, String> entry : credentials.entrySet()) {
			String username = entry.getKey();
			String password = entry.getValue();
			WebElement CreateAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
			CreateAccount.click();		 
			WebElement usernameField = driver.findElement(By.name("firstname"));  
			WebElement passwordField = driver.findElement(By.id("password_step_input"));  
			WebElement Signin=driver.findElement(By.xpath("//button[@name='websubmit']"));

			usernameField.clear();
			usernameField.sendKeys(username);
			passwordField.clear();
			passwordField.sendKeys(password);
			Signin.click();
			
			
			boolean isLoginSuccessful = isLoginSuccessful(driver);

			if (isLoginSuccessful) {
				System.out.println("Login successful for " + username);
			} else {
				System.out.println("Login failed for " + username);
			}

			driver.navigate().back();
		}

		driver.quit();
	}

	private static boolean isLoginSuccessful(WebDriver driver) {
		try {
			WebElement dashboard = driver.findElement(By.id("reg_pages_msg"));  
			return dashboard.isDisplayed();  
		} catch (Exception e) {
			return false;
		}
	}
}


