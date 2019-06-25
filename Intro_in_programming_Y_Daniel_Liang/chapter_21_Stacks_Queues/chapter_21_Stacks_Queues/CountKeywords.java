package chapter_21_Stacks_Queues;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeywords {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Java full source file (*.java): ");
		String filename = input.nextLine();

		input.close();

		File file = new File(filename);
		if (file.exists()) {
			System.out.println("The number of keywords in " + filename + " is " + countKeywords(file));
		} else {
			System.out.println("File " + filename + " does not exist");
		}
	}

	// Create a TreeMap to hold words as key and count as value
	// Map<String, Integer> map = new TreeMap<>();

	public static int countKeywords(File file) throws Exception {
		// Array of all Java keywords + true, false and null
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };

		Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
		int count = 0;

		Scanner scrn = new Scanner(file);

		while (scrn.hasNext()) {
			String word = scrn.next();
			if (keywordSet.contains(word))
				count++;
		}

		return count;

	}

}
