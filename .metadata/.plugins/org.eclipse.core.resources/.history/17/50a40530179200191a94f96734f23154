/*
 * Write a program that prompts the user to enter three integers
 *  and displays the integers in non-decreasing order.
 * SAMPLE RUN:

Enter 3 numbers: 4 3 9 The numbers in sorted order are 3 4 9
 */

package chapter_03_Arrays_Basic;
import java.util.Scanner;
public class Sorting_3elements {


	public static void main (String [] args) { 
		
		int Num4 = 0;
		  //input
		  Scanner scnr = new Scanner(System.in);
		  System.out.println("Enter 3 numbers: ");
	      int Num1 = scnr.nextInt();
	      int Num2 = scnr.nextInt();
	      int Num3 = scnr.nextInt();
	 //sorting
	if (Num1>Num2) {
		Num4 = Num1;
		Num1 = Num2;
		Num2 = Num4;
		}
	 if (Num1 > Num3) {
			Num4 = Num1;
			Num1 = Num3;
			Num3 = Num4;
		} 
	if (Num2 > Num3) {
			Num4 = Num2;
			Num2 = Num3;
			Num3 = Num4;
		}
	 System.out.println("The numbers in sorted order are  " + Num1 + " " + Num2 + " " + Num3);
	}
	
	
}