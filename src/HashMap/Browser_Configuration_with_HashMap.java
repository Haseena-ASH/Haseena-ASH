package HashMap;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Configuration_with_HashMap {

	 public static WebDriver initializeDriver(String browserName) {
	        HashMap<String, String> browserConfig = new HashMap<>();
	        browserConfig.put("chrome", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64.exe");
	        browserConfig.put("firefox", "path/to/geckodriver");
	        browserConfig.put("edge", "path/to/msedgedriver");

	        WebDriver driver = null;

	        switch (browserName.toLowerCase()) {
	            case "chrome":
	                WebDriverManager.chromedriver().setup();
	                ChromeOptions chromeOptions = new ChromeOptions();
	                chromeOptions.addArguments("--start-maximized");
	                driver = new ChromeDriver(chromeOptions);
	                break;

	            case "firefox":
	                WebDriverManager.firefoxdriver().setup();
	                FirefoxOptions firefoxOptions = new FirefoxOptions();
	                firefoxOptions.addArguments("--headless");
	                driver = new FirefoxDriver(firefoxOptions);
	                break;

	            case "edge":
	                WebDriverManager.edgedriver().setup();
	                driver = new EdgeDriver();
	                break;

	            default:
	                System.out.println("Browser not supported");
	                break;
	        }

	        return driver;
	    }

	    public static void main(String[] args) {
	        WebDriver chromeDriver = initializeDriver("chrome");
	        WebDriver firefoxDriver = initializeDriver("firefox");
	        WebDriver edgeDriver = initializeDriver("edge");

	        if (chromeDriver != null) {
	            chromeDriver.get("https://www.facebook.com/");
	        }

	        if (firefoxDriver != null) {
	            firefoxDriver.get("https://www.facebook.com/");
	        }

	        if (edgeDriver != null) {
	            edgeDriver.get("https://www.facebook.com/");
	        }
	    }
	}

