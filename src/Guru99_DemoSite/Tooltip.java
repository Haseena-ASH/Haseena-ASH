package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.findElement(By.className("dropdown-toggle")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Tooltip")).click();
		
		Thread.sleep(3000);
		
		Actions actions =new Actions(driver);
		
	WebElement Tooltip=	driver.findElement(By.linkText("Download now"));
	
	
	 actions.moveToElement(Tooltip).perform();
		
	 Thread.sleep(4000);
   
     System.out.println(driver.findElement(By.xpath("//div[@class='tooltip']")).getText());
	 
     driver.quit();
     
	}

}
