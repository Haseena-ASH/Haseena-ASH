package Guru99_DemoSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Demo {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.findElement(By.className("dropdown-toggle")).click();

		driver.findElement(By.linkText("Table Demo")).click();
		
		Thread.sleep(5000);		

		WebElement element=	driver.findElement(By.xpath("//td[contains(text(),'4')]"));

		Thread.sleep(3000);

		String actualvalue=element.getText();

		Thread.sleep(3000);

		String expectedvalue="4";

		Thread.sleep(3000);

		System.out.println("Actual Value from the element :" +actualvalue);

		if(actualvalue.equals(expectedvalue)) {

			System.out.println("The value Matchess the expected value.");
		}

		else {
			System.out.println("The value  not Matchess the expected value.");

		}

		System.out.println(driver.findElement(By.xpath("//body/table")).getText());

		driver.quit();

	}

}
