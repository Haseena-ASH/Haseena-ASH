package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static void main(String[]args) {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/");
WebElement Search=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
Search.click();
Search.sendKeys("Ash");
Search.submit();
	}
}
