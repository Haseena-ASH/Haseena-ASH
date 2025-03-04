package basicsjava;

public class MethodsExample {
	  // Method with parameters and return value
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = addNumbers(10, 20);
        System.out.println("Sum: " + result);
    }
}
