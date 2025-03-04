package SmokeTest;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafStudios {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.leafstudios.in");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='LEAF RUSH X168  WIRELESS EARPHONES (CARBON BLACK)']")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[@href=\"/collections/smart-watches\"])[2]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//div[@class=\"ProductItem__Wrapper\"])[2]")).click();		

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//span[@class=\"QuantitySelector__Button Link Link--secondary\"])[2]")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[@href=\"/collections/earphones\"])[2]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//div[@class=\"ProductItem__Wrapper\"])[3]")).click();

		Actions action=new Actions(driver);

		action.doubleClick(driver.findElement(By.xpath("(//span[@class=\"QuantitySelector__Button Link Link--secondary\"])[2]"))).perform();


		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();


		System.out.println(driver.findElement(By.xpath("//div[@class=\"Cart__ItemList\"]")).getText());


		//firstproduct
		String name = driver.findElement(By.xpath("(//div[@class='CartItem__Info'])[3]")).getText();
		Thread.sleep(2000);
		String quantity = driver.findElement(By.xpath("(//input[@pattern=\"[0-9]*\"])[6]")).getText();
		String price = driver.findElement(By.xpath("(//span[@class='CartItem__LinePrice Price Heading Text--subdued u-h7'])[3]")).getText();


		//second product
		String name1 = driver.findElement(By.xpath("(//div[@class='CartItem__Info'])[2]")).getText();
		Thread.sleep(2000);

		String quantity1 = driver.findElement(By.xpath("(//input[@pattern=\"[0-9]*\"])[4]")).getText();

		String price1 = driver.findElement(By.xpath("(//span[@class='CartItem__LinePrice Price Heading Text--subdued u-h7'])[2]")).getText();


		//third product

		String name2 = driver.findElement(By.xpath("(//div[@class='CartItem__Info'])[1]")).getText();
		Thread.sleep(2000);

		String quantity2 = driver.findElement(By.xpath("(//input[@pattern=\"[0-9]*\"])[2]")).getText();

		String price2 = driver.findElement(By.xpath("(//span[@class='CartItem__LinePrice Price Heading Text--subdued u-h7'])[1]")).getText();


		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Product Details");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("product name");
		sheet.getRow(0).createCell(1).setCellValue("quantity");
		sheet.getRow(0).createCell(2).setCellValue("price");

		XSSFRow ROW = sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue(name);
		sheet.getRow(1).createCell(1).setCellValue(quantity);
		sheet.getRow(1).createCell(2).setCellValue(price);

		XSSFRow ROW1 = sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue(name1);
		sheet.getRow(2).createCell(1).setCellValue(quantity1);
		sheet.getRow(2).createCell(2).setCellValue(price1);

		XSSFRow ROW2 = sheet.createRow(3);
		sheet.getRow(3).createCell(0).setCellValue(name2);
		sheet.getRow(3).createCell(1).setCellValue(quantity2);
		sheet.getRow(3).createCell(2).setCellValue(price2);

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Introduction\\ExcelFile\\Product100.xlsx");
		workbook.write(fileOut);		
		workbook.close();



	}
}

