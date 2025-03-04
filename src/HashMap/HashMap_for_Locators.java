package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMap_for_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		Map<String,String> m=new HashMap<>();
		m.put("Create Account", "//a[@data-testid='open-registration-form-button']");
		m.put("Text Box", "//input[@aria-label='First name']");
		m.put("SignIn","//button[@name='websubmit']");
		
		 WebElement CreateAccount = driver.findElement(By.xpath(m.get("Create Account")));
		 CreateAccount.click();
		 
		 
		 WebElement TextBox=driver.findElement(By.xpath(m.get("Text Box")));
		 TextBox.sendKeys("Hasee");
		 
		 WebElement Signin=driver.findElement(By.xpath(m.get("SignIn")));
		 Signin.click();
		 
	}

}
