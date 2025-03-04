package basicsjava;

import java.util.Scanner;

public class Converting_numbers_into_words {
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number in words: ");
	        String input = scanner.nextLine().toLowerCase().replaceAll(" and", "").replaceAll("-", " ");
	        String[] words = input.split(" ");
	        
	        long result = 0;
	        long temp = 0;  
	        for (String word : words) {
	            switch (word) {
	                case "one": temp += 1; break;
	                case "two": temp += 2; break;
	                case "three": temp += 3; break;
	                case "four": temp += 4; break;
	                case "five": temp += 5; break;
	                case "six": temp += 6; break;
	                case "seven": temp += 7; break;
	                case "eight": temp += 8; break;
	                case "nine": temp += 9; break;
	                case "ten": temp += 10; break;
	                case "eleven": temp += 11; break;
	                case "twelve": temp += 12; break;
	                case "thirteen": temp += 13; break;
	                case "fourteen": temp += 14; break;
	                case "fifteen": temp += 15; break;
	                case "sixteen": temp += 16; break;
	                case "seventeen": temp += 17; break;
	                case "eighteen": temp += 18; break;
	                case "nineteen": temp += 19; break;
	                case "twenty": temp += 20; break;
	                case "thirty": temp += 30; break;
	                case "forty": temp += 40; break;
	                case "fifty": temp += 50; break;
	                case "sixty": temp += 60; break;
	                case "seventy": temp += 70; break;
	                case "eighty": temp += 80; break;
	                case "ninety": temp += 90; break;
	                case "hundred": temp *= 100; break;
	                case "thousand": result += temp * 1000; temp = 0; break;
	            }
	        }
	        
	        result += temp;  
	        System.out.println("The number is: " + result);
	        scanner.close();
	    }
}
