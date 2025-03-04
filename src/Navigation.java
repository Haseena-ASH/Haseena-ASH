import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chrome-win64 (1)\\chrome-win64.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		Thread.sleep(3000);

		driver.findElement(By.name("q")).sendKeys("ash");

		driver.findElement(By.name("q")).submit();

		Thread.sleep(3000);

		driver.navigate().to("https://www.fb.com");

		Thread.sleep(5000);

		driver.findElement(By.id("email")).sendKeys("ash@gmail.com");

		Thread.sleep(5000);

		driver.navigate().refresh();

		Thread.sleep(4000);

		driver.navigate().back();

		Thread.sleep(5000);

		driver.navigate().forward();

		Thread.sleep(4000);

		driver.quit();

	}

}
