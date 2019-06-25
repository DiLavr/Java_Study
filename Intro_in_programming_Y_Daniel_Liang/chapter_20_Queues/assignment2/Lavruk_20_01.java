/*
 * (Display words in ascending alphabetical order) Write a program that reads
words from a text file and displays all the words (duplicates allowed) in ascending alphabetical order. The words must start with a letter. The text file is passed
as a command-line argument.
 */

package assignment2;
import java.util.*;
import java.io.*;

public class Lavruk_20_01 {
	
	private static void hold(Map<String, Integer> map, String[] words) {
		for (int i = 0; i < words.length; i++) {
			String key = words[i];

			if (key.length() > 0 && Character.isLetter(key.charAt(0))) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
        // Check command-line argument 
        	if (args.length != 1) {
			System.out.println("Usage - java Lavruk_20_01 March_20_01.txt");
			System.exit(1);
		}

		// Check if the file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Couldn't find " + args[0]);
			System.exit(1);
		}

        
        Map<String, Integer> map = new TreeMap<>();
  
				try ( 
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String[] word = input.nextLine().split("[ \n\t\r\"\'.,;:!?()]");
				hold(map, word);
			}
        }
        
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry: entrySet)                   
        System.out.println(entry.getKey());    
	}
}