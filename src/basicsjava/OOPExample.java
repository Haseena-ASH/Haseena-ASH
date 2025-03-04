package basicsjava;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OOPExample {
	 public static void main(String[] args) {
	        Student student1 = new Student("John", 20);
	        Student student2 = new Student("Alice", 22);

	        student1.display();
	        student2.display();
	    }
}
