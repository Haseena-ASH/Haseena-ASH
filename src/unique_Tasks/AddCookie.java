package unique_Tasks;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {
	
	    public static void main(String[] args) {
	     
	        WebDriver driver = new ChromeDriver();

	        try {
	            driver.get("https://www.100percentpure.com");

	            Cookie cookie = new Cookie("myCookie", "cookieValue", "example.com", "/", new Date(System.currentTimeMillis() + 1000000));

	            driver.manage().addCookie(cookie);

	            Set<Cookie> cookies = driver.manage().getCookies();
	            for (Cookie c : cookies) {
	                System.out.println("Cookie Name: " + c.getName());
	                System.out.println("Cookie Value: " + c.getValue());
	            }

	        } finally {
	            driver.quit();
	        }
	    }
	}
