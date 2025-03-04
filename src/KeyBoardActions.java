import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("email"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(username)
		.click()
		.keyDown(username, Keys.SHIFT)
		.sendKeys(username, "HASEENA")
		.keyUp(username,Keys.SHIFT)
		.doubleClick(username)
		.contextClick(username)
		.build()
		.perform();
	}

}
