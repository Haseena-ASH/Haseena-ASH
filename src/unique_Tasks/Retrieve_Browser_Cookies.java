package unique_Tasks;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrieve_Browser_Cookies {
	
	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        
	        try {
	            driver.get("https://www.100percentpure.com");

	            Set<Cookie> cookies = driver.manage().getCookies();

	            for (Cookie cookie : cookies) {
	                System.out.println("Cookie Name: " + cookie.getName());
	                System.out.println("Cookie Value: " + cookie.getValue());
	                System.out.println("Cookie Domain: " + cookie.getDomain());
	                System.out.println("Cookie Path: " + cookie.getPath());
	                System.out.println("Cookie Expiry: " + cookie.getExpiry());
	                System.out.println("Cookie is Secure: " + cookie.isSecure());
	                System.out.println("------");
	            }
	        } finally {
	            driver.quit();
	        }
	    }
	}


