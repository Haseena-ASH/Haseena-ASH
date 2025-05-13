import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chromedriver", "C:\\Users\\RISHITHA\\Downloads\\chromedriver-win64");
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
			
			driver.findElement(By.id("name")).sendKeys("rishi");
			
			driver.switchTo().frame("frm1");
			Select course_dd=new Select(driver.findElement(By.id("course")));
			course_dd.selectByVisibleText("Java");
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("frm2");
			driver.findElement(By.id("firstName")).sendKeys("rishitha");
			
		
			
			
			

		}

	}
