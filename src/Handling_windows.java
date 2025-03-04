import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_windows {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//	String parentWindowHandle=driver.getWindowHandle();
//	System.out.println("parent window handle-"+parentWindowHandle);
//	driver.findElement(By.id("newWindowBtn")).click();
//	Thread.sleep(5000);
//	Set<String>windowHandles=driver.getWindowHandles();
//	for(String windowHandle : windowHandles) {
//		System.out.println(windowHandle);
//	}
	
		String parentWindowHandle=driver.getWindowHandle();
		
		System.out.println("parent Window Handle-"+ parentWindowHandle + driver.getTitle());
		
		driver.findElement(By.id("newTabBtn")).click();

Set<String>windowHandles=driver.getWindowHandles();

for(String windowHandle:windowHandles) {
	
if(! windowHandle.equals(parentWindowHandle)) {
	
	driver.switchTo().window(windowHandle);
	
	System.out.println(driver.findElement(By.id("output")).getText());
	
	driver.findElement(By.id("alertBox")).click();

	System.out.println(driver.switchTo().alert().getText());
	
	driver.switchTo().alert().accept();
	
	System.out.println(driver.findElement(By.id("output")).getText());
	
	Thread.sleep(4000);
}
	
}
driver.switchTo().window(parentWindowHandle);
driver.findElement(By.id("name")).sendKeys("Haseena");

Thread.sleep(3000);

	}

}