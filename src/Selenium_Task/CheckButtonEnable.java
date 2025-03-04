package Selenium_Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class CheckButtonEnable {

	public static void main(String[] args) throws Exception {	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	            driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	            WebElement button = driver.findElement(By.id("course"));
	            Thread.sleep(3000);
	            boolean isButtonEnabled = button.isEnabled();
	            if (isButtonEnabled) {
	                System.out.println("The button with ID 'loginBtn' is enabled.");
	            } else {
	                System.out.println("The button with ID 'loginBtn' is NOT enabled.");
	            }
	       
	        	Thread.sleep(4000);
	            driver.quit();
	    
}

}

