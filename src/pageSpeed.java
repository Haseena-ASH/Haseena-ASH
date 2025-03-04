import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageSpeed {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://pagespeed.web.dev/");

		WebElement urlField = driver.findElement(By.xpath("//input[@type='text']"));

		urlField.clear();

		urlField.sendKeys("https://www.flipkart.com/"); 

		WebElement Button = driver.findElement(By.xpath("(//span[@class=\"VfPpkd-vQzf8d\"])[5]"));

		Button.click();

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(90));

		WebElement performanceScoreElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".lh-exp-gauge__percentage")));

		String performanceScore=performanceScoreElement.getText();

		System.out.println("The performance score of mobile: " + performanceScore);

		Thread.sleep(10000);

		driver.findElement(By.cssSelector("#desktop_tab")).click();

		WebElement ScoreElement=driver.findElement(By.xpath("(//a[@class=\"lh-gauge__wrapper lh-gauge__wrapper--average\"])[1]"));

		String Score= ScoreElement.getText();

		Thread.sleep(7000);

		System.out.println("The performance score of Desktop:" + Score);

		driver.quit();	     
		
		
		
	}

}


