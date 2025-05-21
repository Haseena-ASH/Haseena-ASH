package unique_Tasks;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HDFC_Bank {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@class='exist-custo-menu-link']"));
		action.moveToElement(ele).perform();		
		Thread.sleep(4000);				
		driver.findElement(By.xpath("(//a[@href='https://portal.hdfc.com/login'])[1]")).click();
		String tab1 = driver.getWindowHandle();
		Set<String> tab2 =driver.getWindowHandles();

		for(String tab :tab2){
			if(!tab.equals(tab1)) {
				driver.switchTo().window(tab);
			}}

		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);	

		driver.findElement(By.xpath("(//a[@href='https://portal.hdfc.com/signup?redirectTo=gettingStarted&back=signup'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("hasee");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("26-9-2007");
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("hasee@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobile_no']")).sendKeys("9876543210");
		Thread.sleep(4000);
		driver.switchTo().window(tab1);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href='/search']")).click();
		WebElement searchInput = driver.findElement(By.xpath("//input[@class='cmp-search__input']")); 
		searchInput.sendKeys("emi");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cmp-search__results']"))); 

		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='cmp-search__results']")); 		
		if (!suggestions.isEmpty()) {
			WebElement firstResult = suggestions.get(0);
			System.out.println("Clicking on: " + firstResult.getText()); 
			firstResult.click();
		} else {
			System.out.println("No search results found.");
		}

		Thread.sleep(4000);
		driver.quit();
	}
}
