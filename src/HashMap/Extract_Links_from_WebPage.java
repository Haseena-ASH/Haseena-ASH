package HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extract_Links_from_WebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        Map<String, String> linkMap = new HashMap<>();

        for (WebElement link : links) {
            String linkText = link.getText();
            String url = link.getAttribute("href");

            if (url != null && !url.isEmpty() && !linkText.isEmpty()) {
                linkMap.put(linkText, url);
            }
        }

        for (Map.Entry<String, String> entry : linkMap.entrySet()) {
            System.out.println("Link Text: " + entry.getKey() + " | URL: " + entry.getValue());
        }

        driver.quit();
    }
	}


