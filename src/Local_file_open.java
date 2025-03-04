import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Local_file_open {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chrome-win64 (1)\\chrome-win64.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\DELL\\Screenshots\\Screenshot (21).png");
	driver.manage().window().maximize();
	}

}
