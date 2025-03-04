import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_download_file {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Edge
		
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions options=new EdgeOptions();		
//		
//		HashMap<String, Object>prefs=new HashMap<>();
//		prefs.put("plugins.always_open_pdf_externally",true);
//		prefs.put("download.default_directory","C:\\Users\\DELL\\Downloads");
//		
//		//method
//		options.setExperimentalOption("prefs",prefs);
//		
//		
//		WebDriver driver=new EdgeDriver(options);
//		driver.manage().window().maximize();
//		
//		driver.get("https://file-examples.com/");
//		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
//		driver.findElement(By.xpath("//td[1][text()='"+fileType+"']/following-sibling::td[2]/a")).click();
//		driver.findElement(By.xpath("(//a[starts-with(text(),'Download sample pdf file')])[1]")).click();
//		
	
		
		// chrome
		
		String fileType="PDF";
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();		
		
		HashMap<String, Object>prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_extezrnally",true);
		prefs.put("download.default_directory","C:\\Users\\DELL\\Downloads");
			
	//method
		options.setExperimentalOption("prefs",prefs);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://file-examples.com/");
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[1][text()='"+fileType+"']/following-sibling::td[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[starts-with(text(),'Download sample pdf file')])[1]")).click();
	}

}

