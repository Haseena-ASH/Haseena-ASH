
public class MainApp {

//	    public static void main(String[] args) {
//	        
//	    	calculator calc = new calculator();
//	        
//	        int sum = calc.add(5, 3);
//	        System.out.println("Sum: " + sum); 
//	        
//	        int product = calc.multiply(4, 8);
//	        System.out.println("Product: " + product);
//	    }
	    public static void main(String[] args) {
	    	 calculator mathOps = new  calculator();
	        
	        int[] numbers = {1, 2, 3, 4, 5};
	        
	        for (int num : numbers) {
	        	
	        	int result = mathOps.square(num);
	           System.out.println("The square of " + num + " is " + result);
	        }
	    }
	}