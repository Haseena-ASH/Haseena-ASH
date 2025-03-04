package Selenium_Task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class web_page {

	public static void main(String[] args) throws Exception {
WebDriver driver=new ChromeDriver();
try {
    driver.get("https://www.google.com"); 
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("ash");
    driver.findElement(By.name("q")).submit();
    Thread.sleep(3000);
    driver.navigate().to("https://www.fb.com");
    Thread.sleep(5000);
    driver.findElement(By.id("email")).sendKeys("ash@gmail.com");
    driver.navigate().refresh();
    Thread.sleep(4000);
    driver.navigate().back();
    Thread.sleep(4000);
    driver.navigate().back();
    WebElement element = driver.findElement(By.linkText("Gmail"));
    String text = element.getText();
    Thread.sleep(5000);
    if ("Gmail".equals(text)) {
        System.out.println("Text verification passed.");
    } else {
        System.out.println("Text verification failed. Found text: " + text);
    }
} finally {
	Thread.sleep(3000);
    driver.quit();
}
}
}
