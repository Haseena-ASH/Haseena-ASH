package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickElemenet {

	public static void main(String[] args) throws Exception {
		
 WebDriver driver=new ChromeDriver();

 try {
 
     driver.get("https://www.chaitanya.edu.in");

     WebElement element = driver.findElement(By.className("sf-menu"));
     
     
     driver.manage().window().maximize();
     
    Thread.sleep(4000);

    Actions actions = new Actions(driver);

    actions.contextClick(element).perform();
     
Thread.sleep(5000);
  
    WebElement menuItem = driver.findElement(By.xpath("(//a[@class=\"sf-with-ul-pre sf-with-ul\"])[9]"));
         
    Thread.sleep(4000);
    
    menuItem.click();
    if (menuItem.isDisplayed()) {
    	
        System.out.println("Right-click action was successful!");
        
    } else {
    	
        System.out.println("Right-click action was not successful.");
        
    }

} finally {
  
    driver.quit();
}
	}

}
