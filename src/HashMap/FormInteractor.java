package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormInteractor {
	private static HashMap<String, By> H = new HashMap<>();

	static {
		H.put("username", By.id("email"));
		H.put("password", By.id("pass"));
		H.put("submit_button", By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		H.put("email", By.name("email"));
	}

	public static void interactWithElement(WebDriver driver, String key, String inputText) {
		By locator = H.get(key);

		if (locator != null) {
			WebElement element = driver.findElement(locator);

			if (element != null) {
				if (inputText != null) {
					element.sendKeys(inputText); 
				} else {
					element.click();
				}
			} else {
				System.out.println("Element not found for the key: " + key);
			}
		} else {
			System.out.println("No locator found for the key: " + key);
		}
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();

		try {
			driver.get("https://www.facebook.com/");

			interactWithElement(driver, "username", "testuser");
			interactWithElement(driver, "password", "testpassword");
			interactWithElement(driver, "submit_button", null);
			Thread.sleep(4000);
		} finally {
			driver.quit();
		}
	}

}
