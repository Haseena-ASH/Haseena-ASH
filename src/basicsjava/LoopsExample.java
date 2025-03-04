package basicsjava;

public class LoopsExample {
	  public static void main(String[] args) {
	        System.out.println("For loop:");
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(i);
	        }

	        System.out.println("\nWhile loop:");
	        int i = 1;
	        while (i <= 5) {
	            System.out.println(i);
	            i++;
	        }

	        System.out.println("\nDo-while loop:");
	        i = 1;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 5);
	    }
}
