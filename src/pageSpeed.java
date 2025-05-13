import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class pageSpeed {

	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.setProperty("webdriver.chromedriver", "C:\\Users\\RISHITHA\\Downloads\\chromedriver-win64");
			driver.manage().window().maximize();
			driver.get("https://pagespeed.web.dev");
			WebElement page=driver.findElement(By.xpath("//input[@placeholder='Enter a web page URL\']"));
			page.clear();
			page.sendKeys("https://www.amazon.in/");
			driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[5]")).click();
			Thread.sleep(50000);
			//driver.quit();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(90));
			//WebElement score= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='lh-exp-gauge__svg-wrapper'])[1]")));
			WebElement score=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='lh-exp-gauge__svg-wrapper'])[1]")));
			String scor=score.getText();
			System.out.println(" performance score for mobile device:" +scor);
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("(//span[@class='VfPpkd-YVzG2b'])[2]")).click();
			WebElement scores=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"lh-exp-gauge__svg-wrapper\"])[2]")));
			String score1=scores.getText();
			System.out.println(" performance score for desktop device:" +score1);
			
		
			//System.out.println(driver.findElement(By.cssSelector("(//div[@class='lh-exp-gauge__svg-wrapper'])[1]")));

			

		}
		

	}