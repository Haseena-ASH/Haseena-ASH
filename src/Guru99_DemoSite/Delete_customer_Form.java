package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_customer_Form {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com");
		
		
		driver.findElement(By.className("dropdown-toggle")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Delete Customer Form")).click();
 
		 Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("ash4226");

		Thread.sleep(2000);

		 driver.findElement(By.name("submit")).click();
		 
		 System.out.println(driver.switchTo().alert().getText());
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 
		 Thread.sleep(2000);
		 
		 System.out.println(driver.switchTo().alert().getText());
		 
		 Thread.sleep(2000);

		 driver.switchTo().alert().accept();

		 Thread.sleep(2000);

		driver.quit();
		

	}

}
