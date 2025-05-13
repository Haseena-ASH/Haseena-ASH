import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pop_Up {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
			HashMap<String, Object> profile = new HashMap<String, Object>();
			HashMap<String, Object> prefs = new HashMap<String, Object>();

			conentSettings.put("notifications", 2);
			conentSettings.put("geolocation", 2);
			conentSettings.put("media_stream", 1);
			profile.put("managed_default_content_settings", conentSettings);
			prefs.put("profile", profile);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);		

			//To disable the notifications based permission popup
			//		options.addArguments("disable-notifications");

			//To disable the location based permission popup
			//		options.addArguments("disable-geolocation");

			//To disable the microphone or camera based permission popup
			//		options.addArguments("disable-media-stream");

				
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chromedriver", "C:\\Users\\RISHITHA\\Downloads\\chromedriver-win64");
			driver.manage().window().maximize();

			//To verify notification based permission popup
			driver.get("https://www.cleartrip.com/");

			//To verify location based permission popup
			driver.get("https://whatmylocation.com/");

			//To verify microphone based permission popup
			driver.get("https://mictests.com/");
			Thread.sleep(6000);
			driver.findElement(By.id("mic-launcher")).click();

			//To verify camera based permission popup
			driver.get("https://webcamtests.com/");
			Thread.sleep(6000);
			driver.findElement(By.id("webcam-launcher")).click();

		}

	}
	//https://www.cleartrip.com/
	//https://whatmylocation.com/
	//https://mictests.com/
	//https://webcamtests.com/

