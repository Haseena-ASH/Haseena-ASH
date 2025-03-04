package Selenium_Task;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverAndClick {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		try {

			driver.get("https://www.osmania.ac.in");

			driver.manage().window().maximize();

			WebElement menuItem = driver.findElement(By.xpath("(//a[@class=\"sf-with-ul-pre sf-with-ul\"])[4]"));

			Thread.sleep(4000);

			Actions actions = new Actions(driver);

			actions.moveToElement(menuItem).perform();

			Thread.sleep(4000);

			WebElement submenuItem = driver.findElement(By.linkText("Ph.D."));

			submenuItem.click();

			Thread.sleep(4000);

			System.out.println("Submenu item clicked successfully.!");

		}

		finally {

			driver.quit();
		}
	}
}
