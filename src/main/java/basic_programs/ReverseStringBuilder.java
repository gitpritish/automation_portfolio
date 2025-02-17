package basic_programs;

import java.util.Scanner;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		// Here, we declare a variable str of type String and assign it the value "Automation".
        // new StringBuilder(str): Creates a new StringBuilder object with the content "Automation".
		// reverse(): Uses the built-in reverse() method of StringBuilder to reverse the string.
		// toString(): Converts the reversed StringBuilder object back to a String.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.nextLine();
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
		//System.out.println("The reverse string is: "+reverse);
		scan.close();
	}

}
	