package basicsjava;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Calcula calc = new Calcula();
//        System.out.println("Sum of integers: " + calc.add(10, 20));
 //       System.out.println("Sum of doubles: " + calc.add(10.5, 20.5));
    }
}
