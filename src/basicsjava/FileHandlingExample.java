package basicsjava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
	 public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("example.txt");
	            writer.write("Hello, Java File Handling!");
	            writer.close();

	            FileReader reader = new FileReader("example.txt");
	            int i;
	            while ((i = reader.read()) != -1) {
	                System.out.print((char) i);
	            }
	            reader.close();

	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	 
	 
//	  public static void main(String[] args) {
//	        try {
//	            File file = new File("example.txt");
//	            Scanner scanner = new Scanner(file);
//
//	            while (scanner.hasNextLine()) {
//	                System.out.println(scanner.nextLine());
//	            }
//
//	            scanner.close();
//	        } catch (FileNotFoundException e) {
//	            System.out.println("An error occurred.");
//	            e.printStackTrace();
//	        }
//	    }
}
