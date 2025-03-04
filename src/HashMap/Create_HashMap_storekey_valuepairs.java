package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Create_HashMap_storekey_valuepairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, String> websiteMap = new HashMap<>();
		 websiteMap.put("Google", "https://www.google.co.in/");
		 websiteMap.put("Instragram", "https://www.instagram.com/");		 
		 websiteMap.put("YouTube", "https://www.youtube.com/");
		 
		 
	        String googleURL = websiteMap.get("Google");
	        System.out.println("Google URL: " + googleURL);

	        websiteMap.put("YouTube", "https://www.fb.com");
	        System.out.println("Updated Facebook URL: " + websiteMap.get("YouTube"));

	        websiteMap.remove("Instragram");
	        System.out.println("Instragram removed from the map");

       System.out.println("\nKeys:");
	        for (String key : websiteMap.keySet()) {
	            System.out.println(key);
	        }

	        System.out.println("\nValues:");
	        for (String value : websiteMap.values()) {
	            System.out.println(value);
	        }

	        System.out.println("\nKey-Value Pairs:");
	        for (Map.Entry<String, String> entry : websiteMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	            
	        }		 
	}

}
