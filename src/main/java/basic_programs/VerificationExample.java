package basic_programs;

public class VerificationExample {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int expectedSum = 15; // Expected output

		int actualSum = addNumbers(a, b); // Calls method to add numbers

		// **Verification - Checking if the logic works correctly**
		if (actualSum == expectedSum) {
			System.out.println("✅ Verification Passed: Logic is correct!");
		} else {
			System.out.println("❌ Verification Failed: Logic is incorrect.");
		}
	}

	// Method to add two numbers
	public static int addNumbers(int x, int y) {
		return x + y; // Basic logic to add two numbers
	}
}
