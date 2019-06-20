package chapter_06_User_define_methods;
/*
 Write a method swapArrayEnds() that swaps the first and last elements of its array parameter.
  Ex: sortArray = {10, 20, 30, 40} becomes {40, 20, 30, 10}. The array's size may differ from 4. 
 * 
 * 
 */




//import java.util.Scanner;
public class Modifyanarrayparameter {

	public static void swapArrayEnds(int[] newArray, int arrSize) {
		int n = 0;
		int tempVal = 0;
		
		for (n=0;n<=arrSize;++n) {
			tempVal = newArray[n];
			newArray[n] = newArray[arrSize-1];
			newArray[arrSize-1] = tempVal;
								}
						return;
				}
	
	public static void main (String [] args) {
	      int numElem = 4;
	      int[] sortArray = new int[numElem];
	      int i = 0;

	      sortArray[0] = 10;
	      sortArray[1] = 20;
	      sortArray[2] = 30;
	      sortArray[3] = 40;

	      swapArrayEnds(sortArray, numElem);

	      for (i = 0; i < numElem; ++i) {
	         System.out.print(sortArray[i]);
	         System.out.print(" ");
	      }
	      System.out.println("");

	      return;
	   }

		
}
