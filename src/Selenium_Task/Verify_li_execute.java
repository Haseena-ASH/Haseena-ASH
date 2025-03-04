package Selenium_Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Verify_li_execute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/"); 
		
        WebElement ulElement = driver.findElement(By.cssSelector(" div.demo-list > ul"));
        
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        if (liElements.size() == 9) {
        	
            System.out.println("Verification passed: There are exactly 6 <li> elements.");
            
        } else {
            System.out.println("Verification failed: There are " + liElements.size() + " <li> elements.");
        }
       
        driver.quit();
	}
}
