package basicsjava;

public class ArithmeticOperations {
	 public static void main(String[] args) {
	        // Declare two numbers
	        int num1 = 10;
	        int num2 = 5;
	        
	        
	        int sum = num1 + num2;
	        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
	        
	        int difference = num1 - num2;
	        System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);
	        
	        int product = num1 * num2;
	        System.out.println("Product: " + num1 + " * " + num2 + " = " + product);
	        
	        if (num2 != 0) { 
	            int quotient = num1 / num2;
	            System.out.println("Quotient: " + num1 + " / " + num2 + " = " + quotient);
	        } else {
	            System.out.println("Division by zero is not allowed.");
	        }
	        
	        if (num2 != 0) {  
	            int remainder = num1 % num2;
	            System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
	        } else {
	            System.out.println("Modulus by zero is not allowed.");
	        }
	    }
}
