package basicsjava;

import java.util.ArrayList;

public class ArrayListExample {
	 public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        
	        list.add("Java");
	        list.add("Python");
	        list.add("C++");

	        System.out.println("List: " + list);
	        
	        list.remove("Python");

	        System.out.println("List after removal: " + list);
	    
//	 ArrayList<Integer> list = new ArrayList<>();
//     list.add(10);
//     list.add(20);
//     list.add(30);
//
//     for (int num : list) {
//         System.out.println(num);
 //    }
}
}
