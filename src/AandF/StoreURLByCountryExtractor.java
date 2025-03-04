package AandF;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StoreURLByCountryExtractor {
	
	 public static void main(String[] args) {
	    
			WebDriver driver=new ChromeDriver();

	        try {
	            driver.get("https://www.abercrombie.com/shop/wd");

	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    		XSSFWorkbook workbook=new XSSFWorkbook();
	    		XSSFSheet sheet=workbook.createSheet("Store URLs");


	    		sheet.createRow(0);
	    		sheet.getRow(0).createCell(0).setCellValue("Country");
	    		sheet.getRow(0).createCell(1).setCellValue("Store Name");
	    		sheet.getRow(0).createCell(2).setCellValue("Store URL");

	            // List of countries (Update with the actual list of countries or selectors)
	            List<WebElement> countryLinks = driver.findElements(By.cssSelector(".country-link")); // Update with the actual selector for country links

	            int rowNum = 1;

	            for (WebElement countryLink : countryLinks) {
	                String countryName = countryLink.getText(); 
	                countryLink.click(); 
	                TimeUnit.SECONDS.sleep(3);

	                List<WebElement> storeLinks = driver.findElements(By.cssSelector(".store-link")); // Update with the actual selector for store links

	                for (WebElement storeLink : storeLinks) {
	                    String storeName = storeLink.getText(); 
	                    String storeURL = storeLink.getAttribute("href");
	                    sheet.createRow(rowNum++);
	                    XSSFRow row = null;
						row.createCell(0).setCellValue(countryName); 
	                    row.createCell(1).setCellValue(storeName); 
	                    row.createCell(2).setCellValue(storeURL);  
	                }

	                // Navigate back to the main page or country list page if necessary
	                driver.navigate().back(); // Adjust this based on your website's navigation behavior
	                TimeUnit.SECONDS.sleep(2); // Wait for the page to load back
	            }

	            try (FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\DELL\\eclipse-workspace\\Introduction\\ExcelFile\\StoreURLs_by_Country.xlsx"))) {
	        		workbook.write(fos);
	            }

	            System.out.println("Excel file created successfully with store URLs by country.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	
}
