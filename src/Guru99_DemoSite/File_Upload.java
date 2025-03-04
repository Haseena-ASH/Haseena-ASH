package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws Exception {


		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com");

		driver.manage().window().maximize();

		driver.findElement(By.className("dropdown-toggle")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("File Upload")).click();
		
		Thread.sleep(5000);
		
		WebElement fileInput = driver.findElement(By.id("uploadfile_0"));

		Thread.sleep(8000);
		
		fileInput.sendKeys("C:\\Users\\DELL\\Documents\\DOCUMENTS\\loops,datatypes and operators1.docx");

		driver.findElement(By.id("terms")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("submitbutton")).click();

		Thread.sleep(3000);

		System.out.println(driver.findElement(By.id("res")).getText());

		Thread.sleep(3000);

		driver.quit();


	}

}
