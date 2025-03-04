import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chrome-win64 (1)\\chrome-win64.exe");	
		
		WebDriver driver1=new ChromeDriver();
	
		try {
		  driver1.get("https://www.google.com");
		 
          File screenshot = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
          
          File destination = new File("screenshot.png");
          
          FileUtils.copyFile(screenshot, destination);
           
          System.out.println("Screenshot taken and saved as screenshot.png");
      } 
	
		catch (IOException e) {
         
		
		System.err.println("Error saving screenshot: " + e.getMessage());
      } 
		
		finally { 
    	
			Thread.sleep(5000);
          
			driver1.quit();
      }
  }

	}
