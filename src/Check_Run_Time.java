import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Run_Time {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
long startTime = System.currentTimeMillis();

try {	
	driver.get("https://www.google.com");

	driver.findElement(By.name("q")).sendKeys("ash");
	driver.findElement(By.name("q")).submit();

	driver.navigate().to("https://www.fb.com");
	driver.findElement(By.id("email")).sendKeys("ash@gmail.com");

	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	driver.quit();
	
long endTime=System.currentTimeMillis();
long  elapsedTime=endTime-startTime;
System.out.println("Elapse time:"+elapsedTime+"milliseconds");

}
finally {
	driver.quit();
	
}     
	}

}
