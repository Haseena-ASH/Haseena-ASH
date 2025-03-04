package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsideOutside {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.findElement(By.className("dropdown-toggle")).click();

		Thread.sleep(4000);

		driver.findElement(By.linkText("Inside & Outside Block Level Tag")).click();

		Thread.sleep(6000);


		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();

		Thread.sleep(4000);

		String pageTitle = driver.getTitle();


		WebElement textElement = driver.findElement(By.xpath("//div[@class=\"k1zIA rSk4se\"]"));


		Thread.sleep(4000);

		String pageText = textElement.getText();


		if (pageTitle.equals(pageText)) {

			System.out.println("The page title and the page text are the same.");

		} else {

			System.out.println("The page title and the page text are different.");
		}

		driver.navigate().to("https://demo.guru99.com/test/block.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@href='http://www.fb.com']")).click();

		Thread.sleep(3000);

		String expectedText = "facebook";


		WebElement anchorElement = driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));

		Thread.sleep(3000);

		String actualText = anchorElement.getText();


		if (expectedText.equals(actualText)) {
			System.out.println("The anchor text matches the expected text.");
		} else {
			System.out.println("The anchor text does not match the expected text.");
			System.out.println("Expected: " + expectedText);
			System.out.println("Actual: " + actualText);
		}
		Thread.sleep(3000);

		driver.quit();


	}

}
