package Operators;

public class Assignment_Operator {
    public static void main(String[] args) {
        // Basic assignment
        int a = 10;
        int b = 5;

        System.out.println("Initial values: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Using += (Add and Assign)
        a += b;  // a = a + b (a = 10 + 5)
        System.out.println("After a += b: a = " + a); // a = 15

        // Using -= (Subtract and Assign)
        b -= 2;  // b = b - 2 (b = 5 - 2)
        System.out.println("After b -= 2: b = " + b); // b = 3

        // Using *= (Multiply and Assign)
        a *= 2;  // a = a * 2 (a = 15 * 2)
        System.out.println("After a *= 2: a = " + a); // a = 30

        // Using /= (Divide and Assign)
        b /= 3;  // b = b / 3 (b = 3 / 3)
        System.out.println("After b /= 3: b = " + b); // b = 1

        // Using %= (Modulo and Assign)
        a %= 7;  // a = a % 7 (a = 30 % 7)
        System.out.println("After a %= 7: a = " + a); // a = 2
    }
}



