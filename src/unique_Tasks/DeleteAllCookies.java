package unique_Tasks;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {
    public static void main(String[] args) {

	
	WebDriver driver = new ChromeDriver();
	
	

     try {
         driver.get("https://www.100percentpure.com");

         driver.manage().addCookie(new Cookie("cookie1", "value1"));
         driver.manage().addCookie(new Cookie("cookie2", "value2"));

         driver.manage().deleteAllCookies();

         if (driver.manage().getCookies().isEmpty()) {
             System.out.println("All cookies have been deleted.");
         } else {
             System.out.println("Some cookies still exist.");
         }

     } finally {
         driver.quit();
     }
 }
}
