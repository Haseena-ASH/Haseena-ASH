package Selenium_Task;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyImageSrc {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.ulta.com/");
	               
	            driver.manage().window().maximize();
	            
	            driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	           
	            WebElement imageElement = driver.findElement(By.xpath("(//div[@class='Image']//img)[1]"));
	            
	            String srcValue = imageElement.getAttribute("src");
	            
	            String expectedSrcValue = "https://media.ulta.com/i/ulta/HP_WK2724_ImageBkgrdCard_UBC_XL?w=1055&$Fire100BGLight$&fmt=auto";
	           
	            if (srcValue.equals(expectedSrcValue)) {
	              
	            	System.out.println("Test Passed: The 'src' attribute is set to the expected value.");
	            }
	
	            else {
	                
	            	System.out.println("Test Failed: The 'src' attribute is '" + srcValue + "', expected '" + expectedSrcValue + "'.");
	            
	            driver.quit();
	        }  
	}
	
	}
	















