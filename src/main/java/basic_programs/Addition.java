        package basic_programs;

        import java.util.Scanner;

        public class Addition {

            public static void main(String[] args) {
                // TODO Auto-generated method stub
                Scanner scan = new Scanner(System.in);
                System.out.println("enter the 1st no: ");
                int num1 = scan.nextInt();

                System.out.println("enter the 2nd no: ");
                int num2 = scan.nextInt();
                int sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

                // enter the 1st no.
                // enter the 2nd no.
                // the sum is = no1 + no2


            }
        }
