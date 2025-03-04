package Selenium_Task;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Verify_paragraph {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/"); 
       
		WebElement sectionElement = driver.findElement(By.id("content-wrapper"));
        
		List<WebElement> paragraphElements = sectionElement.findElements(By.tagName("p"));
        
		boolean allTextCorrect = true;
        
        for (WebElement paragraph : paragraphElements) {
        	
            if (!"Read More".equals(paragraph.getText().trim())) {
            	
                allTextCorrect = false;
                
                System.out.println("Paragraph with text: '" + paragraph.getText() + "' does not contain 'Read More'.");
                
                break;
            }
        }
        
        if (allTextCorrect) {
        	
            System.out.println("Verification passed: All paragraphs contain the text 'Read More'.");
            
        } else {
        	
            System.out.println("Verification failed: Not all paragraphs contain the text 'Read More'.");
            
        driver.quit();
      
        }
	}

}
