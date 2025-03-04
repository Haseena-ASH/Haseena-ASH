package Selenium_Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyPageTitle {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		try {
			
            driver.get("https://www.100percentpure.com");
            Thread.sleep(6000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    		try {

    			driver.findElement(By.xpath("//button[@class=\"needsclick klaviyo-close-form go1982198487 kl-private-reset-css-Xuajs1\"]")).click();
    		}
    		catch(Exception e) {
    		}
            String pageTitle = driver.getTitle();
            
            String expectedTitle = "100% PURE: Organic & Natural Beauty Products";
            
            if (expectedTitle.equals(pageTitle)) 
            {
                System.out.println("Title verification passed. The title is: " + pageTitle);
            } else 
            {
                System.out.println("Title verification failed. Expected: " + expectedTitle + ", but got: " + pageTitle);
            }
        } 
		finally {
			
            driver.quit();
        }
    }
}
