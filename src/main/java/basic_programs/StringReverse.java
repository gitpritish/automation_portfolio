package basic_programs;

import java.util.Scanner;

public class StringReverse {

    //stringReverse this is class name
    public static void main(String[] args) {

		/* 
		 main this is method
		 Indexing start from Zero (0) but length start from (1)
		 https://www.youtube.com/watch?v=rRgrGQZKzpk&ab_channel=CodeCrush
		 me >> here
		 index
		 me
		 01
		 length
		 me
		 12
		 length
		 charAt
		 
		 */
        System.out.println("Enter the string which you want to reverse it: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String rstr = "";
        char ch;

        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("Revese String = " + rstr);

    }

}
