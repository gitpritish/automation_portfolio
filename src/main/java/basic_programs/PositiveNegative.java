package basic_programs;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		int number;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please Enter the number: ");
//		number = input.nextInt();
//		
//		if (number > 0)
//			System.out.printf("%d is positive number",number);
//		else if (number < 0)
//			System.out.printf("%d is negative number",number);
//		else
//			System.out.printf("%d is zero");


        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        num = scan.nextInt();
        if (num > 0)
            System.out.println("positive");
        else if (num < 0)
            System.out.println("negative");
        else
            System.out.println("Zero");


    }

}
