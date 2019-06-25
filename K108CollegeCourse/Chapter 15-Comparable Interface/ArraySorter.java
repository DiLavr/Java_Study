import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorter {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_ELEMENTS = 5; // Number of items in array
		ArrayList<Integer> userInts = new ArrayList<Integer>(); // Array of user defined values
		int i = 0; // Loop index

		// Prompt user for input, add values to array
		System.out.println("Enter " + NUM_ELEMENTS + " numbers...");
		for (i = 1; i <= NUM_ELEMENTS; ++i) {
			System.out.print(i + ": ");
			userInts.add(new Integer(scnr.nextInt()));
		}

		// Sort ArrayList of Comparable elements
		Collections.sort(userInts);

		// Print sorted array
		System.out.print("\nSorted numbers: ");
		for (i = 0; i < NUM_ELEMENTS; ++i) {
			System.out.print(userInts.get(i) + " ");
		}
		System.out.println("");

		return;
	}
}