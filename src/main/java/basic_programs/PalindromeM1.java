package basic_programs;

import java.util.Scanner;

public class PalindromeM1 {

	public static void main(String[] args) {
		
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
