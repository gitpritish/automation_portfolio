package Operators;

import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {
//        int a = 10, b = 5, c = 20;

//        // Logical AND (&&) - Both conditions must be true
//        System.out.println("(a > b) && (a > c): " + ((a > b) && (a > c))); // false
//
//        // Logical OR (||) - At least one condition must be true
//        System.out.println("(a > b) || (a > c): " + ((a > b) || (a > c))); // true
//
//        // Logical NOT (!) - Reverses the result
//        System.out.println("!(a > b): " + !(a > b)); // false

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int Age = scan.nextInt();
        Boolean hasVoterId = true;
        if (Age >= 18 && hasVoterId) {
            System.out.println("You are Eligible for Voting: ");
        } else {
            System.out.println("You are Not Eligible for Voting: ");
        }
    }
}