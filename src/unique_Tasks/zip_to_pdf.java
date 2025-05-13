package unique_Tasks;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zip_to_pdf {

	    public static void main(String[] args) {
	        String zipFilePath = "C:\\Users\\DELL\\Documents\\DOCUMENTATION ON GOLDmain.zip";
	        String outputDir = "C:\\Users\\DELL\\Documents\\";

	        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
	            ZipEntry entry;
	            while ((entry = zis.getNextEntry()) != null) {
	                File newFile = new File(outputDir + File.separator + entry.getName());
	                System.out.println("Extracting: " + newFile.getAbsolutePath());

	                // Create directories for nested files
	                new File(newFile.getParent()).mkdirs();

	                try (FileOutputStream fos = new FileOutputStream(newFile)) {
	                    byte[] buffer = new byte[1024];
	                    int len;
	                    while ((len = zis.read(buffer)) > 0) {
	                        fos.write(buffer, 0, len);
	                    }
	                }
	                zis.closeEntry();
	            }

	            System.out.println("ZIP file extracted!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	

}
