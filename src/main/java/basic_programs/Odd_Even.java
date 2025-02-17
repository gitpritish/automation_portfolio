package basic_programs;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //enter the number
        // the number is even or odd


        // if the reminder is zero then number is even else number is odd


        //int number, reminder;

        //System.out.print("Enter the number: ");
//		Scanner scan = new Scanner(System.in);
//		number = scan.nextInt();
//		scan.close();
//		
//		reminder = number % 2;
//		
//		if (reminder == 0)
//			System.out.print("The number "+number+" is even");
//		else
//			System.out.print("The number "+number+" is odd");


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;

        System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);

    }

}
