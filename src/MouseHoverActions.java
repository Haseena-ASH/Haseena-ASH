import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		 try {
	           
	            driver.get("https://www.flipkart.com/");

	            driver.manage().window().maximize();

	            driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]")).click();
	            
	            Thread.sleep(4000);
	         
	            Actions actions = new Actions(driver);
	         
	            WebElement elementToHoverOver = driver.findElement(By.linkText("Watches and Accessories"));
	     
	            actions.moveToElement(elementToHoverOver).perform();
	            
	            Thread.sleep(4000);
	            
	            driver.findElement(By.linkText("Men & Women Watches")).click();
	            
	            Thread.sleep(2000);
	            
	           driver.findElement(By.xpath("(//div[@class=\"_1sdMkc LFEi7Z\"])[9]")).click();
	            
	            Thread.sleep(4000);
	      
	        }
		 
		 finally {
	          
	}
		 
}
	
}
