package basic_programs;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		System.out.println("Enter the Amount: ");
		Scanner scan = new Scanner (System.in);
		int money = scan.nextInt();
		if (money >= 50) {
			System.out.println("Happy");	
		}
		else {
			System.out.println("Sad");
		}

	}

}
