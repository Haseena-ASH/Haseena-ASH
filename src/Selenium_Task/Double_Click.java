package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 WebDriver driver = new ChromeDriver();
	        	
	        	try {
	        		
	        	
	            driver.get("https://www.geeksforgeeks.org/java");

	       WebElement element = driver.findElement(By.linkText("Java Strings"));
	      
 Thread.sleep(5000);
	     
 Actions actions = new Actions(driver);
	       
	            actions.doubleClick(element).perform();

	           
	            WebElement resultElement = driver.findElement(By.xpath("(//li[@value='3'])[1]"));
	            
	            Thread.sleep(5000);
	            
	            if (resultElement.isDisplayed()) {
	            	
	                System.out.println("Double-click action was successful!");
	                
	            } else {
	            	
	                System.out.println("Double-click action was not successful.");
	                
	            }

	        } finally {
	          
	        	
	            driver.quit();
}	           

	}

}
