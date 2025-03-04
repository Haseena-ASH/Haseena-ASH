package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Accessing_Links {

	public static void main(String[] args) throws Exception {


		ChromeOptions options = new ChromeOptions();        

		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

		WebDriver driver=new ChromeDriver(options);

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.findElement(By.className("dropdown-toggle")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Accessing Link")).click();

		Thread.sleep(5000);

		driver.findElement(By.linkText("click here")).click();

		Thread.sleep(3000);
		
		String ASH= driver.getTitle();

		System.out.println("Page Title: " + ASH);

		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='http://www.fb.com\']")).click();
		
		Thread.sleep(3000);

		String H= driver.getTitle();

		System.out.println("Page Title: " + H);


		Thread.sleep(2000);
		
		driver.quit();

	}

}
