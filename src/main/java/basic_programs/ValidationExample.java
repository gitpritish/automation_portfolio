package basic_programs;
	import java.util.Scanner;

	public class ValidationExample {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Taking user input
	        System.out.print("Enter your phone number: ");
	        String phoneNumber = scanner.nextLine();

	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();

	        // **Validation - Checking user inputs**
	        if (validatePhoneNumber(phoneNumber) && validateEmail(email)) {
	            System.out.println("✅ Validation Successful! Your details are correct.");
	        } else {
	            System.out.println("❌ Validation Failed! Please enter valid details.");
	        }
	        scanner.close();
	    }

	    // Method to validate phone number (exactly 10 digits)
	    public static boolean validatePhoneNumber(String phoneNumber) {
	        String phonePattern = "^[0-9]{10}$"; // Only numbers, exactly 10 digits
	        if (phoneNumber.matches(phonePattern)) {
	            return true;  // Phone number is valid
	        } else {
	            System.out.println("❌ Invalid phone number! It must contain exactly 10 digits.");
	            return false;
	        }
	    }

	    // Method to validate email format
	    public static boolean validateEmail(String email) {
	        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
	        if (email.matches(emailPattern)) {
	            return true;  // Email is valid
	        } else {
	            System.out.println("❌ Invalid email format. Example: user@example.com");
	            return false;
	        }
	    }
	}


