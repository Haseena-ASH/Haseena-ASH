package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajax_Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.findElement(By.className("dropdown-toggle")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Ajax Demo")).click();

		Thread.sleep(4000);

		driver.findElement(By.id("no")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@type='reset']")).click();

		Thread.sleep(4000);

		driver.findElement(By.id("yes")).click();

		Thread.sleep(4000);

		driver.findElement(By.id("buttoncheck")).click();

		WebElement ASH=driver.findElement(By.className("radiobutton"));

		System.out.println(ASH.getText());

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='reset']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("no")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id("buttoncheck")).click();

		WebElement ASH1=driver.findElement(By.className("radiobutton"));

		System.out.println(ASH1.getText());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
