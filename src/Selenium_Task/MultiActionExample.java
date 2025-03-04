package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiActionExample {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		try {
       
            driver.get("https://www.flipkart.com/");

         driver.manage().window().maximize();
         
            Actions actions = new Actions(driver);

            WebElement inputField = driver.findElement(By.cssSelector(".Pke_EE"));
           
            actions.moveToElement(inputField) 
            
                   .click() 
                   .sendKeys("mobiles 5g")
                   .click() 
                   .perform(); 
            
            Thread.sleep(7000);
        } finally {
        	 Thread.sleep(7000);
            driver.quit();
        }
		
	}

}
