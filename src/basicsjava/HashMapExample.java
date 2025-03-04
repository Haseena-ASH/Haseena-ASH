package basicsjava;

import java.util.HashMap;

public class HashMapExample {
	 public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("John", 25);
	        map.put("Alice", 30);
	        map.put("Bob", 35);

	        for (String key : map.keySet()) {
	            System.out.println(key + ": " + map.get(key));
	        }
	    }
}
