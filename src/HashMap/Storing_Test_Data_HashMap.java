package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Storing_Test_Data_HashMap {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Map<String, String> r = new HashMap<>();
		r.put("Email", "Ash@gmail.com");
		r.put("Password", "hasee@123");
		r.put("FullName", "Haseena");
		r.put("UserName", "Hasee_4226");

		for (Map.Entry<String, String> entry : r.entrySet()) {
			String KeyName = entry.getKey();
			String KeyValue = entry.getValue();
			Thread.sleep(3000);
			WebElement field = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));

			if (KeyName.equals("Email")) {
				field = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
			} else if (KeyName.equals("Password")) {
				field = driver.findElement(By.xpath("//input[@name='password']"));
			} else if (KeyName.equals("FullName")) {
				field = driver.findElement(By.xpath("//input[@name='fullName']"));
			} else if (KeyName.equals("UserName")) {
				field = driver.findElement(By.xpath("//input[@name='username']"));
			}
			field.sendKeys(KeyValue);
		}

		WebElement signup=driver.findElement(By.xpath("//button[text()='Sign up']"));
		Thread.sleep(4000);
		signup.click();
		Thread.sleep(4000);
		driver.quit();
	}
}