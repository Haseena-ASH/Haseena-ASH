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
		

						// extra
						driver.get("https://text-compare.com");
						WebElement input1=driver.findElement(By.id("inputText1"));
						WebElement input2=driver.findElement(By.id("inputText2"));
						input1.sendKeys("Welcome to selenium");
						
						Actions action=new Actions(driver);
						
						//ctrl+A
						action.keyDown(Keys.CONTROL);
						action.sendKeys("a");
						action.keyUp(Keys.CONTROL);
						action.perform();
						
						//Double click
						//action.doubleClick(driver.findElement(By.id("inputText1"))).perform();
						
						//ctrl+c
						action.keyDown(Keys.CONTROL);
						action.sendKeys("c");
						action.keyUp(Keys.CONTROL);
						action.perform();
						
						//tab 
						action.sendKeys(Keys.TAB);
						action.perform();
						
						//ctrl+v
						action.keyDown(Keys.CONTROL);
						action.sendKeys("v");
						action.keyUp(Keys.CONTROL);
						action.perform();
						
						
						if(input1.getAttribute("value").equals(input2.getAttribute("value")))
							System.out.println("Text is same..");
						else 
								System.out.println("Text is not same..");
						
			
	}

}
