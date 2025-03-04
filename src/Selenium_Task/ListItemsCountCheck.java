package Selenium_Task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListItemsCountCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("http://example.com");
         WebElement ulElement = driver.findElement(By.id("myList")); 
         List<WebElement> listItems = ulElement.findElements(By.tagName("li"));
         if (listItems.size() == 5) {
             System.out.println("The unordered list contains exactly 5 list items.");
         } else {
             System.out.println("The unordered list contains " + listItems.size() + " list items, but it should contain exactly 5.");
         }
	}

}
