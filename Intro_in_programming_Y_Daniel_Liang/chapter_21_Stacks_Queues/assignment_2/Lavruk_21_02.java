/**
 * (Display nonduplicate words in ascending order) Write a program that reads
words from a text file and displays all the nonduplicate words in ascending order.
The text file is passed as a command-line argument.
 */
package assignment_2;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Lavruk_21_02 {
	public static void main(String[] args) throws Exception {
		// Check length of command-line argument
		if (args.length != 1) {
			System.out.println("Usage: java Lavruk_21_02 March_20_01.txt");
			System.exit(1);
		}

		// Check if file exists
		File textFile = new File(args[0]);
		if (!textFile.exists()) {
			System.out.println("The file " + args[0] + " does not exist.");
			System.exit(2);
		}

		// Create a set
		TreeSet<String> set = new TreeSet<>();

		// Read nonduplicate words from the file
		try ( // Create an input file
				Scanner scrn = new Scanner(textFile);) {
			while (scrn.hasNext()) {
				String[] words = scrn.nextLine().split("[ \n\t\r.,;:!?()-]");
				for (String word : words) {
					if (word.length() > 0)
						set.add(word.toLowerCase());
				}
			}
		}

		// Output

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}