package chapter_21_Stacks_Queues;
/*
 * All in order that the differents between just HashSet
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		// Create a hash set
		Set<String> set = new LinkedHashSet<>();

		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");

		System.out.println(set);

		// Display the elements in the hash set
		for (String element : set)
			System.out.print(element.toLowerCase() + " ");
	}
}