package basicsjava;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read the first number
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read the second number
        
        int sum = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}
