/**
 * (Maximum consecutive increasingly ordered substring) Write a program that
prompts the user to enter a string and displays the maximum consecutive
increasingly ordered substring. Analyze the time complexity of your program.
 */

package chapter_22_Efficient_Algorotms;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Lavruk_22_01 {

	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);

		// Asking user to enter String
		System.out.println("Enter a String: ");
		String userinput = new String();
		userinput = scrn.nextLine();

		// putting String to the array by each element
		LinkedList<Character> list = new LinkedList<>();
		for (int i = 0; i < userinput.length(); i++) {
			list.add(userinput.charAt(i));
		}

		// sorting using collections
		Collections.sort(list);

		// Delete dubls by using HashSet
		System.out.println("sorted and no dublicats");
		HashSet<Character> test = new HashSet<>(list);
		// Output
		for (Character tt : test) {
			System.out.print(tt);
		}
		scrn.close();
	}
}
