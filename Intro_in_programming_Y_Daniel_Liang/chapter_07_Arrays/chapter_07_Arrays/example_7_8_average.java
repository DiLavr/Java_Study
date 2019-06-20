package chapter_07_Arrays;


/*
Chapter 7 Exercise 8:

Write two overloaded methods that return the average of an
    array with the following headers:
    public static int average(int[] array)
    public static double average(double[] array)
    Write a test program that prompts the user to enter ten double values, invokes this
    method, and displays the average value.

Example of input 1,0 2,0 3,0 5,8 6,8 1,0 2,0 3,0 5,8 6,8 
*/

import java.util.Scanner;
public class example_7_8_average {
    
	//method average with int
	public static int average(int[] array) {
        int sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
    }
	//method average with double (overloaded)
	public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array) 
            sum += val;
        return sum / array.length;
    }
	
	
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int size = 10;
        double[] vals = new double[size];
        System.out.print("Enter 10 double values: ");

       //input of array
        for (int i = 0; i < vals.length; i++) 
            vals[i] = scnr.nextDouble();
    
        
        System.out.printf("The average is: %.2f", average(vals));
    }

    

    
}