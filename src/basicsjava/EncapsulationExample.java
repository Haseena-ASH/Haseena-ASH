package basicsjava;
class Person {
    private String name;
    private int age;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
public class EncapsulationExample {
	 public static void main(String[] args) {
	        Person person = new Person();
	        person.setName("John");
	        person.setAge(25);

	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
}
