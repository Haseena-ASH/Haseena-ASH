package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndHoldExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

        try {
        
            driver.manage().window().maximize();
            
            Actions actions = new Actions(driver);

            driver.get("https://dhtmlx.com/docs/products/dhtmlxTree");
            
            driver.findElement(By.linkText("Services")).click();

            WebElement element = driver.findElement(By.linkText("Services"));
            
            actions.clickAndHold(element).perform();
            
            Thread.sleep(3000);
            
            actions.release().perform();

        } catch (InterruptedException e) {
            
        	e.printStackTrace();
            
        } finally {
          
            driver.quit();
        }	
	}
}
