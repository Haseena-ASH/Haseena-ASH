package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownVerification {

public static void main(String[] args) throws Exception {
		
WebDriver driver=new ChromeDriver();

try {
    
    driver.get("http://www.chaitanyacolleges.com/cgcstudent/index.php");     
 
    WebElement dropdownElement = driver.findElement(By.xpath("(//select[@class=\"select1\"])[2]"));
    
    Select dropdown = new Select(dropdownElement);
    
    String visibleText = "February"; 
  
    boolean optionFound = false;

    for (WebElement option : dropdown.getOptions()) {
        
    	if (option.getText().equals(visibleText)) {
            
        	optionFound = true;
    
            break;
        }
    }
    
    if (optionFound) {
        
    	dropdown.selectByVisibleText(visibleText);
    
        System.out.println(" option with visible text is found:     "+ visibleText +" ");
    
    } else {
    
    	System.out.println("Option with text '" + visibleText + "' not found.");

    }

} finally {
	
	Thread.sleep(4000);
   
    driver.close();   
}
}
}
