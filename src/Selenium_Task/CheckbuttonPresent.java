package Selenium_Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckbuttonPresent {
public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
try {

    driver.get("https://www.facebook.com");
    boolean isButtonPresent;
    try {
       WebElement button = driver.findElement(By.id("u_0_0_EJ"));
        isButtonPresent = (button != null);
    } 
    catch (Exception e) {
        isButtonPresent = false;
    }
    if (isButtonPresent) {
        System.out.println("The button with ID 'submitBtn' is present on the page.");
    } else {
        System.out.println("The button with ID 'submitBtn' is NOT present on the page.");
    }
} finally {
	Thread.sleep(4000);
    driver.quit();
}

}
	}
