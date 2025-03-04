package basicsjava;
import java.util.Scanner;
public class Calcula {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Simple Calculator");
		        System.out.println("------------------");
		        
		        try {
		            System.out.print("Enter the first number: ");
		            double num1 = scanner.nextDouble();

		            System.out.print("Enter an operator (+, -, *, /): ");
		            char operator = scanner.next().charAt(0);

		            System.out.print("Enter the second number: ");
		            double num2 = scanner.nextDouble();

		            double result;

		            // Perform calculation based on the operator
		            switch (operator) {
		                case '+':
		                    result = num1 + num2;
		                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
		                    break;

		                case '-':
		                    result = num1 - num2;
		                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
		                    break;

		                case '*':
		                    result = num1 * num2;
		                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
		                    break;

		                case '/':
		                    if (num2 != 0) {
		                        result = num1 / num2;
		                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
		                    } else {
		                        System.out.println("Error: Division by zero is not allowed.");
		                    }
		                    break;

		                default:
		                    System.out.println("Error: Invalid operator.");
		            }
		        } catch (Exception e) {
		            System.out.println("Error: Invalid input. Please enter numbers and a valid operator.");
		        } finally {
		            scanner.close();
		        }
	}

}
