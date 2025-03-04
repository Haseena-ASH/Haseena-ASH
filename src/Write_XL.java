import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Write_XL {

	public static void main(String[] args) throws Exception {

	HSSFWorkbook workbook=new HSSFWorkbook();
	HSSFSheet sheet=workbook.createSheet("TestSheet");

	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("HELLO");
	sheet.getRow(0).createCell(1).setCellValue("WORLD");
	
	sheet.createRow(1);
	sheet.getRow(1).createCell(0).setCellValue("ASH");
	sheet.getRow(1).createCell(1).setCellValue("h");
	
	sheet.createRow(2);
	sheet.getRow(2).createCell(0).setCellValue("MD");
	sheet.getRow(2).createCell(1).setCellValue("HASEENA");
	
	
	File file =new File("C:\\Users\\DELL\\eclipse-workspace\\Introduction\\ExcelFile\\Test1.xls");
	FileOutputStream fos=new FileOutputStream(file);
	workbook.write(fos);
	workbook.close();
	}
}
