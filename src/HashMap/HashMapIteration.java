package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		Map<String, String> H = new HashMap<>();
		H.put("USA", "aa");
		H.put("Japan", "bb");
		H.put("Germany", "cc");
		H.put("India", "dd");

		System.out.println("Iterating over keys using for-each loop:");
		for (String country : H.keySet()) {
			System.out.println("Country: " + country);
		}

		System.out.println("\nIterating over values using for-each loop:");
		for (String capital : H.values()) {
			System.out.println("Capital: " + capital);
		}

		System.out.println("\nIterating over key-value pairs using for-each loop:");
		for (Map.Entry<String, String> entry : H.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("\nIterating over key-value pairs using Iterator:");
		Iterator<Map.Entry<String, String>> entryIterator = H.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
