import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chrome-win64 (1)\\chrome-win64.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		System.out.println(driver.findElement(By.id("output")).getText());

		Thread.sleep(3000);

		driver.findElement(By.id("alertBox")).click();

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

		System.out.println(driver.findElement(By.id("output")).getText());

		//Confirm Box

		System.out.println(driver.findElement(By.id("output")).getText());

		driver.findElement(By.id("confirmBox")).click();

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

		System.out.println(driver.findElement(By.id("output")).getText());

		driver.findElement(By.id("confirmBox")).click();

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(4000);

		driver.switchTo().alert().dismiss();

		System.out.println(driver.findElement(By.id("output")).getText());

		//prompt Box

		System.out.println(driver.findElement(By.id("output")).getText());

		driver.findElement(By.id("promptBox")).click();

		Thread.sleep(4000);

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(4000);

		driver.switchTo().alert().sendKeys("ash");

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("output")).getText());

		driver.findElement(By.id("promptBox")).click();

		Thread.sleep(4000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("output")).getText());

		Thread.sleep(2000);

		driver.quit();
	}
}