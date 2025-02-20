package basic_programs;

public class LoopsExample {

	public static void main(String[] args) {
		// 1. FOR LOOP (Counts from 1 to 5)
		System.out.println("For Loop:");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Iteration: " + i);
		}

		// 2. WHILE LOOP (Counts from 1 to 5)
		System.out.println("\nWhile Loop:");
		int j = 1;
		while (j <= 5) {
			System.out.println("Iteration: " + j);
			j++;
		}

		// 3. DO-WHILE LOOP (Counts from 1 to 5)
		System.out.println("\nDo-While Loop:");
		int k = 1;
		do {
			System.out.println("Iteration: " + k);
			k++;
		} while (k <= 5);

		// 4. FOR-EACH LOOP (Iterating through an array)
		System.out.println("\nFor-Each Loop:");
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int num : numbers) {
			System.out.println("Array Value: " + num);
		}
	}
}
