package Guru99_DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_CheckBox {
		
	
	    public static void main(String[] args) throws Exception {
	     
	      WebDriver driver=new ChromeDriver();
	      

	  driver.get("https://demo.guru99.com");

	  driver.manage().window().maximize();
	  
	  driver.findElement(By.className("dropdown-toggle")).click();
     
	  driver.findElement(By.linkText("Radio & Checkbox Demo")).click();
	
	  Thread.sleep(3000);
	  
	  
	            WebElement radioButton = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	            
	          //  radioButton.click();	            
	            
	            Thread.sleep(3000);
	          
	            WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
	            
	          //  checkbox.click();
	            
	            WebElement checkbox1= driver.findElement(By.id("vfb-6-2"));
	            
	            checkbox1.click();
	            
	           // Thread.sleep(3000);
	            
	            boolean isRadioButtonSelected = radioButton.isSelected();
	            System.out.println("Radio Button Selected: " + isRadioButtonSelected);

	           
	            boolean isCheckboxSelected = checkbox.isSelected();
	            System.out.println("Checkbox Selected: " + isCheckboxSelected);

	            
	            boolean isCheckboxSelected1 = checkbox.isSelected();
	            System.out.println("Checkbox Selected: " + isCheckboxSelected1);

	            Thread.sleep(3000);
	            
	            driver.quit();
	        }
}
