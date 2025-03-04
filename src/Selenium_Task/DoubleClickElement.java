package Selenium_Task;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
 
public class DoubleClickElement {

	public static void main(String[] args) {		
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://google.com");
        driver.manage().window().maximize();
        
        WebElement enteringText=driver.findElement(By.className("gLFyf"));
        enteringText.sendKeys("Selenium");
        
        
        Actions action=new Actions(driver);
        action.moveToElement(enteringText).doubleClick().perform();
        
        if(enteringText !=null)
        {
        	 if(enteringText !=null)
             {
             	System.out.println("The Entered Text Highlighted So, it is Doubleclicked");
             }
             else
             {
             	System.out.println("The Enter Text is Not Highlighted So,it is Not DoubleClicked");
             }
        }
	}
}
