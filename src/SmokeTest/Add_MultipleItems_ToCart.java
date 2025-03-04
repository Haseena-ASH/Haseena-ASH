package SmokeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Haseena
public class Add_MultipleItems_ToCart {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.100percentpure.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("onetrust-accept-btn-handler")).click();	
		Thread.sleep(6000);

		
//		Common.clickElement("xpath","//button[@class='header-search-submit header-search-submit--minimal']");
//		Common.textBoxInput("xpath","(//input[@data-search-types='product,article,'])[1]",data.get(Website).get("Products"));
		
		
		driver.findElement(By.xpath("//button[@class='header-search-submit header-search-submit--minimal']")).click();
		driver.findElement(By.id("header-search")).sendKeys("Coffee Bean Caffeine Eye Cream");
		driver.findElement(By.linkText("Coffee Bean Caffeine Eye Cream")).click();
		driver.findElement(By.id("button-add-cart")).click();
		driver.findElement(By.xpath("//button[@class=\"slide-menu cart-close-icon cart-menu-close alt-focus\"]")).click();
		driver.findElement(By.xpath("//button[@onclick='btnSearch()']")).click();
		driver.findElement(By.id("header-search")).sendKeys("Bare My Love Nail Set");
		driver.findElement(By.linkText("View all Products")).click();
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[29]")).click();
		driver.findElement(By.xpath("(//button[@class='alt-focus cart-item-quantity-button cart-item-increase'])[1]")).click();
		driver.findElement(By.xpath("//button[@class=\"slide-menu cart-close-icon cart-menu-close alt-focus\"]")).click();
		driver.navigate().to("https://www.100percentpure.com");
		driver.findElement(By.xpath("//button[@onclick='btnSearch()']")).click();
		driver.findElement(By.id("header-search")).sendKeys("Glossy Locks Grow More Shampoo");
		driver.findElement(By.linkText("Glossy Locks Grow More Shampoo")).click();
		driver.findElement(By.xpath("//span[@class=\"button-text add to carttt\"]")).click();
		driver.findElement(By.xpath("(//button[@class='alt-focus cart-item-quantity-button cart-item-increase'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='alt-focus cart-item-quantity-button cart-item-increase'])[1]")).click();
		driver.findElement(By.xpath("//span[@class=\"button-text cart-button-checkout-text\"]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='nfgb6p0']")).getText());

//		//firstproduct
//		String name = driver.findElement(By.xpath("(//p[@class='_1x52f9s1 _1fragempf _1x52f9sv _1fragemrq'])[5]")).getText();
//		String quantity = driver.findElement(By.xpath("(//div[@class=\"_1m6j2n3e _1fragemp5 _1fragemub _1fragemuu\"])[3]")).getText();
//		String price = driver.findElement(By.xpath("(//p[@class=\"_1x52f9s1 _1fragempf _1x52f9sv _1fragemrq\"])[6]")).getText();
//
//
//		//second product
//		String name1 = driver.findElement(By.xpath("(//p[@class='_1x52f9s1 _1fragempf _1x52f9sv _1fragemrq'])[3]")).getText();
//
//		String quantity1 = driver.findElement(By.xpath("(//div[@class=\"_1m6j2n3e _1fragemp5 _1fragemub _1fragemuu\"])[2]")).getText();
//
//		String price1 = driver.findElement(By.xpath("(//p[@class=\"_1x52f9s1 _1fragempf _1x52f9sv _1fragemrq\"])[4]")).getText();
//
//
//		//third product
//		String name2 = driver.findElement(By.xpath("(//p[@class=\"_1x52f9s1 _1fragempf _1x52f9sv _1fragemrq\"])[1]")).getText();
//		String quantity2 = driver.findElement(By.xpath("(//div[@class=\"_1m6j2n3e _1fragemp5 _1fragemub _1fragemuu\"])[1]")).getText();
//		String price2 = driver.findElement(By.xpath("(//p[@class=\"_1x52f9s1 _1fragempf _1x52f9sv _1fragemrq\"])[2]")).getText();
//
//
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		XSSFSheet sheet = workbook.createSheet("Product Details");
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("product name");
//		sheet.getRow(0).createCell(1).setCellValue("quantity");
//		sheet.getRow(0).createCell(2).setCellValue("price");
//
//		XSSFRow ROW = sheet.createRow(1);
//		sheet.getRow(1).createCell(0).setCellValue(name);
//		sheet.getRow(1).createCell(1).setCellValue(quantity);
//		sheet.getRow(1).createCell(2).setCellValue(price);
//
//		XSSFRow ROW1 = sheet.createRow(2);
//		sheet.getRow(2).createCell(0).setCellValue(name1);
//		sheet.getRow(2).createCell(1).setCellValue(quantity1);
//		sheet.getRow(2).createCell(2).setCellValue(price1);
//
//		XSSFRow ROW2 = sheet.createRow(3);
//		sheet.getRow(3).createCell(0).setCellValue(name2);
//		sheet.getRow(3).createCell(1).setCellValue(quantity2);
//		sheet.getRow(3).createCell(2).setCellValue(price2);
//
//		 FileOutputStream fileOut = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Introduction\\ExcelFile\\ProductDetails1.xlsx");
//					workbook.write(fileOut);		
//					workbook.close();
//				}
		//	}
		//	}
		//	}
	}
}


