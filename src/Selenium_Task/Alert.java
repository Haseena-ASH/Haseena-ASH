package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.browserstack.com/users/sign_up");

		driver.findElement(By.id("user_full_name")).sendKeys("username"); 
		driver.findElement(By.id("input-lg text user_email_ajax")).sendKeys("username.xyz.net");
		driver.findElement(By.id("user_password")).sendKeys("Your_Password");
		driver.findElement(By.id("user_submit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert(); 
		String alertMessage= driver.switchTo().alert().getText(); 
		System.out.println(alertMessage);
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); 
		}
}


