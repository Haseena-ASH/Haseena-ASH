import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class FileUpload_Robot_SendKeys {

	public static void main(String[] args) throws AWTException, Exception

	{

		Robot robot=new Robot();

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("(//div[@class='col-xs-6 col-xs-offset-6'])[2]")).click();

		robot.setAutoDelay(2000);

		StringSelection stringSelection =new StringSelection("‪F:\\DESKTOP\\DOCUMENTS\\loops,datatypes and operators1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		//SendKeys
//		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		driver.findElement(By.id("myFile")).sendKeys("‪F:\\DESKTOP\\DOCUMENTS\\loops,datatypes and operators1.docx");
//		
//		Thread.sleep(3000);
//		
		driver.quit();
	}

}