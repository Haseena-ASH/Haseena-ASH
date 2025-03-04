import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chrome-win64 (1)\\chrome-win64.exe");
	
		ChromeOptions options = new ChromeOptions();        
        
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(w);
		
		 action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
	}
}