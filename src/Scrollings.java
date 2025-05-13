import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;

public class Scrollings {
	

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;	
			js.executeScript("window.scrollBy(0,1500)","");
			System.out.println(js.executeScript("return window.pageYOffset"));
			Thread.sleep(1000);

			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
			System.out.println(js.executeScript("return window.pageYOffset"));
			Thread.sleep(3000);
			
			WebElement ele=driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
			js.executeScript("arguments[0].scrollIntoView()",ele);
			System.out.println(js.executeScript("return window.pageYOffset"));
			Thread.sleep(3000);
			driver.manage().logs().get(LogType.BROWSER);
			Thread.sleep(3000);

			driver.quit();

			}

	}

