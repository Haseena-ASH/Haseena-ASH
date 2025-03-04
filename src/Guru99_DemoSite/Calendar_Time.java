package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Calendar_Time {

	public static void main(String[] args) throws Exception {


		ChromeOptions options = new ChromeOptions();        

		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

		WebDriver driver=new ChromeDriver(options);

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.findElement(By.className("dropdown-toggle")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Selenium DatePicker Demo")).click();

		Thread.sleep(5000);

		WebElement dateInput = driver.findElement(By.xpath("//input[@name='bdaytime']"));

		WebElement timeInput = driver.findElement(By.xpath("//input[@name='bdaytime']"));

		WebElement Input = driver.findElement(By.xpath("//input[@name='bdaytime']"));


		String birthdate="10-26-2013";

		String birthtime="10:36";

		String A="AM";

		dateInput.sendKeys(birthdate);

		dateInput.sendKeys(Keys.TAB);

		Thread.sleep(5000);

		timeInput.sendKeys(birthtime);

		Thread.sleep(5000);

		Input.sendKeys(A);

		Input.sendKeys(Keys.TAB);
		
		Thread.sleep(5000);
		
driver.findElement(By.xpath("//input[@type='submit']")).click();

Thread.sleep(5000);

    System.out.println(driver.findElement(By.xpath("//body/div[2]")).getText());

driver.quit();

	}

}
