package chapter_22_Efficient_Algorotms;

import java.util.Scanner;

public class Lavruk_22_01_2 {

	static String[] testim = new String[5];

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (true) {
			String nxt = scan.next();
			add(nxt, i++);
		}

	}

	public static void add(String nxt, int i) {
		testim[i] = nxt;
	}
}