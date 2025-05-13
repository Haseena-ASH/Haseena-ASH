package unique_Tasks;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class pdf_to_zip {

	    public static void main(String[] args) {
	        String pdfFilePath = "C:\\Users\\DELL\\Documents\\Agile Methodology1.pdf";
	        String zipFilePath = "C:\\Users\\DELL\\Documents\\Agile Methodology1.zip";

	        try (
	            FileOutputStream fos = new FileOutputStream(zipFilePath);
	            ZipOutputStream zipOut = new ZipOutputStream(fos);
	            FileInputStream fis = new FileInputStream(pdfFilePath)
	        ) {
	            ZipEntry zipEntry = new ZipEntry("file.pdf");
	            zipOut.putNextEntry(zipEntry);

	            byte[] bytes = new byte[1024];
	            int length;
	            while ((length = fis.read(bytes)) >= 0) {
	                zipOut.write(bytes, 0, length);
	            }

	            System.out.println("PDF file has been successfully zipped!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


