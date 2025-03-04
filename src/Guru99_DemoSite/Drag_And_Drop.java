package Guru99_DemoSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws Exception {

		ChromeOptions options = new ChromeOptions();        

		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

		WebDriver driver=new ChromeDriver(options);

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.className("dropdown-toggle")).click();

		driver.findElement(By.linkText("Drag and Drop Action")).click();

		Actions actions = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.xpath("//li[@id='credit2']/a")); 

		WebElement targetElement = driver.findElement(By.xpath("//ol[@id='bank']/li/br"));

		actions.dragAndDrop(sourceElement, targetElement).perform();

		WebElement sourceElement1 = driver.findElement(By.xpath("(//li[@id=\"fourth\"]/a)[1]")); 

		WebElement targetElement1 = driver.findElement(By.xpath("//ol[@id=\"amt7\"]/li"));

		actions.dragAndDrop(sourceElement1, targetElement1).perform();

		WebElement sourceElement2 = driver.findElement(By.xpath("//li[@id=\"credit1\"]/a")); 

		WebElement targetElement2 = driver.findElement(By.xpath("//ol[@id=\"loan\"]/li"));

		actions.dragAndDrop(sourceElement2, targetElement2).perform();

		WebElement sourceElement3 = driver.findElement(By.xpath("(//li[@id=\"fourth\"]/a)[2]")); 

		WebElement targetElement3 = driver.findElement(By.xpath("//ol[@id=\"amt8\"]/li"));

		actions.dragAndDrop(sourceElement3, targetElement3).perform();

		WebElement G=  driver.findElement(By.xpath("//div[@id=\"bal3\"]"));
		
		System.out.println(G.getText());
		
		driver.quit();

	}

}
