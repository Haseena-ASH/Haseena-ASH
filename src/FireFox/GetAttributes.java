package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributes {

	public static void main(String[] args) {
		
			WebDriver driver = new EdgeDriver();
			driver.get("http://www.google.com");
			WebElement searchButton = driver.findElement(By.name("btnK"));
			System.out.println("Name of the button is: "+searchButton.getAttribute("name"));
			System.out.println("Id of the button is: "+searchButton.getAttribute("value"));
			System.out.println("Class of the button is: "+searchButton.getAttribute("class"));
			System.out.println("Label of the button is: "+searchButton.getAttribute("aria- label"));
			System.out.println("****");
			WebElement searchBox = driver.findElement(By.name("q"));
			searchButton.sendKeys("Packt Publishing");
			
			
			driver.close();			}
		

}
