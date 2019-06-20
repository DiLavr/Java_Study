package chapter_07_Arrays;
/*
Chapter 7 Exercise 9:
 *
 *      (Find the smallest element)
 *      Write a method that finds the smallest element in an array
 *      of double values using the following header:
 *
 *          - public static double min(double[] array)
 *
 *      Write a test program that prompts the user to enter ten
 *      numbers, invokes this method to return the minimum value,
 *      and displays the minimum value.

Example of input 1,9 2,5 3,7 2 1,5 6 3 4 5 2
*/



import java.util.Scanner;
public class example_7_9_minimum {

	//method minimum 
		public static double min(double[] array) {
	        double min = array[0];
	        for (int i=0; i< array.length; i++) 
	        {  	if (min > array[i]) min = array[i]; }
	        return min;	    }
	
	
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int size = 10;
        double[] vals = new double[size];
        System.out.print("Enter 10 double values: ");

       //input of array
        for (int i = 0; i < vals.length; i++) 
            vals[i] = scnr.nextDouble();
    
       //output
        System.out.printf("The minimun number is: %.1f", min(vals));
    }  
}
