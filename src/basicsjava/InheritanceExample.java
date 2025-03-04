package basicsjava;
class Animal {
    public void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class InheritanceExample {
	 public static void main(String[] args) {
	        Animal myAnimal = new Animal();
	        myAnimal.sound();
	        
	        Dog myDog = new Dog();
	        myDog.sound();
	    }
}
