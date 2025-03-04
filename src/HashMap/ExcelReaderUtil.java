package HashMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReaderUtil {
		  public static Map<String, String> readExcel(String filePath, int rowIndex) throws IOException {
		        Map<String, String> dataMap = new HashMap<>();
		        
		        File file=new File("C:\\Users\\DELL\\eclipse-workspace\\Introduction\\ExcelFile\\Test2.xlsx ");
				FileInputStream fis=new FileInputStream(file);
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				XSSFSheet sheet=workbook.getSheetAt(0);
				XSSFRow headerRow = sheet.getRow(0); 
				XSSFRow dataRow = sheet.getRow(rowIndex + 1);
		        if (dataRow != null) {
		            for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
		                String key = headerRow.getCell(i).getStringCellValue();
		                String value = dataRow.getCell(i).getStringCellValue();
		                dataMap.put(key, value);
		            }
		        }

		        workbook.close();
		        fis.close();
		        return dataMap;
		  
	}
	
	}
	