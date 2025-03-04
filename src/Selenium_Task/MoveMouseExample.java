package Selenium_Task;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MoveMouseExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		
        try {
        	
         driver.manage().window().maximize();
         
            driver.get("https://www.chaitanya.edu.in");
        
            Actions actions = new Actions(driver);

          Thread.sleep(4000);
          
            actions.moveByOffset(100, 50).perform();

        } finally {
        	
          Thread.sleep(5000);
          
            driver.quit();
        }
	}
}