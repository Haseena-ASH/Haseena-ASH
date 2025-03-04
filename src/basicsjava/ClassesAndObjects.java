package basicsjava;
class Car {
    String make;
    String model;

    // Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method
    public void displayInfo() {
        System.out.println("Car Make: " + make + ", Model: " + model);
    }
}

public class ClassesAndObjects {
	 public static void main(String[] args) {
	        Car car1 = new Car("Toyota", "Corolla");
	        car1.displayInfo();
	    }
}
