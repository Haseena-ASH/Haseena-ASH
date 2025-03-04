package HashMap;

import java.util.HashMap;

public class ErrorComparison {

	public static void main(String[] args) {
		 HashMap<String, String> expectedErrors = new HashMap<>();
	        
	        expectedErrors.put("INVALID_LOGIN", "Invalid username or password.");
	        expectedErrors.put("MISSING_FIELDS", "Required fields are missing.");
	        expectedErrors.put("EMAIL_FORMAT", "Invalid email format.");
	        expectedErrors.put("PASSWORD_WEAK", "Password is too weak.");
	        expectedErrors.put("SERVER_ERROR", "Internal server error. Please try again later.");
	        
	        String actualError1 = "Invalid username or password."; 
	        String actualError2 = "Required fields are missing.";
	        
	        compareErrorMessages(expectedErrors, "INVALID_LOGIN", actualError1);
	        compareErrorMessages(expectedErrors, "MISSING_FIELDS", actualError2);
	        
	    }

	    public static void compareErrorMessages(HashMap<String, String> expectedErrors, String errorCode, String actualError) {
	        String expectedError = expectedErrors.get(errorCode);

	        if (expectedError == null) {
	            System.out.println("Error code not found in the expected errors list.");
	            return;
	        }

	        if (expectedError.equals(actualError)) {
	            System.out.println("Success! Error message matches expected message: " + actualError);
	        } else {
	            System.out.println("Error mismatch! Expected: " + expectedError + ", but got: " + actualError);
	        }
	    }
	}

