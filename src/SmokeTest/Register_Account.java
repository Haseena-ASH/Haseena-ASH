package SmokeTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Account {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.100percentpure.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();	
		
		driver.findElement(By.xpath("//button[@class='needsclick klaviyo-close-form kl-private-reset-css-Xuajs1']")).click();

		driver.findElement(By.xpath("//li[@class='header-account']")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("login-email")).sendKeys("Ash2642@gmail.com");
		
		driver.findElement(By.id("login-password")).sendKeys("GH2642");

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[@class='button hover-animation leader'])[1]")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Watermelon Cucumber Water Locking Moisturizer");

		driver.findElement(By.linkText("Watermelon Cucumber Water Locking Moisturizer")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("button-add-cart")).click(); 
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='slide-checkout-buttons']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
