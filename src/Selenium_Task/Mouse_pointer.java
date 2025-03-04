package Selenium_Task;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Mouse_pointer {

			public static void main(String[] args) throws Exception {
 
		        WebDriver driver = new ChromeDriver();
    
		        try {
		           
		            driver.get("https://www.flipkart.com/");

		            driver.manage().window().maximize();

		            driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]")).click();
		            
		         Thread.sleep(4000);
		         
		         Actions actions = new Actions(driver);
		         
		            WebElement elementToHoverOver = driver.findElement(By.className("CPYntE"));
		     
		            actions.moveToElement(elementToHoverOver).perform();
		            
		            Thread.sleep(4000);
		            
		            if (elementToHoverOver.isDisplayed()) {
		            	
		                System.out.println("Flipkart elements  displayed successful!");
		                
		            } else {
		            	
		                System.out.println("Flipkart elements  displayed  not successful!");
		                
		            }
		        } finally {
		      
		            driver.quit();  
	}
			}
		}