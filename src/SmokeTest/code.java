package SmokeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class code {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		long startTime = System.currentTimeMillis();

		try {	
			
			
			driver.get("https://www.100percentpure.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
			driver.findElement(By.xpath("//button[@class='header-search-submit header-search-submit--minimal']")).click();
			WebElement element=driver.findElement(By.xpath("//input[@id='header-search']"));
			element.sendKeys("Non Latex Makeup Blender");
			element.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//img[@src='https://www.100percentpure.com/cdn/shop/products/1ASWDBS_Makeup_Blender_Primary_1024x.jpg?v=1626951518']")).click();
		//	driver.findElement(By.xpath("(//div[@class='product-item__wrapper'])[1]")).click();
			driver.findElement(By.xpath("//button[@id='button-add-cart']")).click();
			driver.findElement(By.xpath("//div[@class='cart-close-icon-wrapper']")).click();
			//driver.navigate().back();
			driver.findElement(By.xpath("//button[@class='header-search-submit header-search-submit--minimal']")).click();
			WebElement search=driver.findElement(By.xpath("(//input[@class='form-input is-predictive'])[1]"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@placeholder=\"Type to search\"])[1]")).sendKeys("Lip Caramel");
			driver.findElement(By.xpath("//img[@src='https://cdn.shopify.com/s/files/1/0648/1955/products/1CLCSK_Lip_Caramel_Scotch_Kiss_Primary.jpg?v=1695868239']")).click();
			driver.findElement(By.xpath("//button[@id='button-add-cart']")).click();
			driver.findElement(By.xpath("//button[@name='checkout']")).click();
			
			
			
			
			
			
			
		long endTime=System.currentTimeMillis();
		long  elapsedTime=endTime-startTime;
		System.out.println("Elapse time:"+elapsedTime+"milliseconds");

		}
		finally {
			driver.quit();

			}

		}

		
		
		
		
		
		
	}


