package Selenium_Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

public static void main(String[] args) throws Exception {
		
WebDriver driver=new ChromeDriver();

driver.get("https://results.chaitanya.edu.in/");

driver.findElement(By.linkText("Autonomous Reults")).click();

boolean isButtonPresent;

try {
   
	WebElement button = driver.findElement(By.xpath("//input[@value='Submit']"));
  
   isButtonPresent = (button != null);
} 

catch (Exception e) {

	isButtonPresent =true;
}

if (isButtonPresent) {
	
    System.out.println("The button with ID 'submitBtn' is present on the page.");
}

else {
	
    System.out.println("The button with ID 'submitBtn' is NOT present on the page.");

Thread.sleep(4000);

driver.quit();

}

}
	
}
