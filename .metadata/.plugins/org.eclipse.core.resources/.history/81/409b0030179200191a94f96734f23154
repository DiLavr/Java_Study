package chapter_03_Arrays_Basic;

import java.util.Scanner;

public class isbn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 // Prompt the user to enter the first 9 digits of a 10-digit ISBN
		 
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();

		// Extract the digits of the ISBN
		int d1 = isbn / 100000000;
		int remaining = isbn % 100000000;
		int d2 = remaining / 10000000;
		remaining %= 10000000;
		int d3 = remaining / 1000000;
		remaining %= 1000000;
		int d4 = remaining / 100000;
		remaining %= 100000;
		int d5 = remaining / 10000;
		remaining %= 10000;
		int d6 = remaining / 1000;
		remaining %= 1000;
		int d7 = remaining / 100;
		remaining %= 100;
		int d8 = remaining / 10;
		remaining %= 10;
		int d9 = remaining;

		// Compute checkSum
		int checkSum  = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
				 
		//System.out.println(isbn);		 
		//System.out.println(checkSum);
				 

		
		// Display the 10-digit ISBN
				 
				 
				 
		
		if (checkSum == 10)
			System.out.println("The ISBN-10 number is "+ 0 + isbn + "X");
			else
			System.out.println("The ISBN-10 number is " + 0 + isbn + checkSum);
		input.close();
	} 
	
	
	
}
