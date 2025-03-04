package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Exception {
		
WebDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com");

driver.findElement(By.className("dropdown-toggle")).click();

Thread.sleep(3000);

driver.findElement(By.linkText("Login")).click();

driver.findElement(By.id("email")).sendKeys("Ash26@gmail.com");

driver.findElement(By.id("passwd")).sendKeys("782642");
	
WebElement Button=driver.findElement(By.id("SubmitLogin"));

Button.click();
 
WebElement element=driver.findElement(By.className("error-box"));

System.out.println(element.getText());

	driver.quit();

	}
}
