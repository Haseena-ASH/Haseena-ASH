package basicsjava;

public class SwapNumbers {
	public static void main(String[] args) {
        int a = 5, b = 10;

        
        a = a + b; 
        b = a - b; 
        a = a - b;  
        System.out.println("After swapping:");
        System.out.println("a = " + a); 
        System.out.println("b = " + b);  
    }
}
