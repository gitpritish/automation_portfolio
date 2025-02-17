package Operators;

import java.util.Scanner;

public class Arithmetic_Operators {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the Money Amount: ");
//        float money = scan.nextInt();
//        boolean inStock = true;
//
//        if (money >= 50000 && inStock==true) {
//            System.out.println("Ollaaa... : Enjoy the Gift");
//        } else {
//            System.out.println("Ohhh......: Better luck next time");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = scan.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));


    }

}
