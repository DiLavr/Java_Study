package chapter_21_Stacks_Queues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SetListPerfomanceTest {
	static final int N = 50000;

	public static void main(String[] args) {

		// add numbers to the Array
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(i);
			Collections.shuffle(list);
		}

		// Create HashSet and test its performance
		Collection<Integer> set1 = new HashSet<>(list);
		System.out.println("Member time test to HashSet is " + getTestTime(set1) + " milliseconds");
		System.out.println("Remove Element from HashSet in " + getRemoveTime(set1) + " milliseconds");

		Collection<Integer> set2 = new LinkedHashSet<>(list);
		System.out.println("Member time test to LinkedHashSet is " + getTestTime(set2) + " milliseconds");
		System.out.println("Remove Element from LinkedHashSet in " + getRemoveTime(set2) + " milliseconds");

		Collection<Integer> set3 = new TreeSet<>(list);
		System.out.println("Member time test to TreeSet is " + getTestTime(set3) + " milliseconds");
		System.out.println("Remove Element from TreeSet in " + getRemoveTime(set3) + " milliseconds");

		Collection<Integer> List1 = new ArrayList<>(list);
		System.out.println("Member time test to ArrayList is " + getTestTime(List1) + " milliseconds");
		System.out.println("Remove Element from ArrayList in " + getRemoveTime(List1) + " milliseconds");

		Collection<Integer> List2 = new LinkedList<>(list);
		System.out.println("Member time test to LinkedList is " + getTestTime(List2) + " milliseconds");
		System.out.println("Remove Element from LinkedList in " + getRemoveTime(List2) + " milliseconds");
	}

	public static long getTestTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();
		// Test if a number is in the collection
		for (int i = 0; i < N; i++)
			c.contains((int) (Math.random() * 2 * N));

		return System.currentTimeMillis() - startTime;

	}

	public static long getRemoveTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < N; i++)
			c.remove(i);

		return System.currentTimeMillis() - startTime;

	}

}
