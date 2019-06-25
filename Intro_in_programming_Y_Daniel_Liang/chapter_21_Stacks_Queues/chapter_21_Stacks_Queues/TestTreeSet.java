package chapter_21_Stacks_Queues;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// Create a hash set
		Set<String> set = new HashSet<>();

		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");

		TreeSet<String> treeSet = new TreeSet<>(set); // making treeSet from Set throw constructor
		System.out.println("Sorted tree set: " + treeSet);

		// Use the methods in SortedSet interface
		System.out.println("first(): " + treeSet.first()); // first element
		System.out.println("last(): " + treeSet.last()); // last element
		System.out.println("headSet(\"New York\"): " + // everything before NY
				treeSet.headSet("New York"));
		System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));

		// Use the methods in NavigableSet interface
		System.out.println("lower(\"P\"): " + treeSet.lower("P")); // greatest element less then P
		System.out.println("higher(\"P\"): " + treeSet.higher("P")); // greatest element less then P
		System.out.println("floor(\"P\"): " + treeSet.floor("P")); // greater or equel to element P
		System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P")); //
		System.out.println("pollFirst(): " + treeSet.pollFirst()); // выта�?кивает первый и
																	// мен�?ет ве�?ь set
		System.out.println("pollLast(): " + treeSet.pollLast()); // выта�?кивает по�?ледний и
																	// замен�?ет set
		System.out.println("New tree set: " + treeSet);
	}
}