package Selenium_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

	driver.get("https://www.flipkart.com");
	
	 String a=driver.getPageSource();
     System.out.println(a);
			 
	
	}

}
