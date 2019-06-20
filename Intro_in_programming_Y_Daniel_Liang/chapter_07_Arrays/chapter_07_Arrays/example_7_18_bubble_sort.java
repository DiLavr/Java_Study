package chapter_07_Arrays;


/**
 * Chapter 7 Exercise 18:
 *
 *      (Bubble sort)
 *      Write a sort method that uses the bubble sort algorithm.
 *      The bubble sort algorithm makes several passes through the array.
 *      On each pass, successive neighboring pairs are compared.
 *      If a pair is not in order, its values are swapped; otherwise,
 *      the values remain unchanged. The technique is called a bubble sort or
 *      sinking sort because the smaller values gradually �bubble� their way to the
 *      top and the larger values �sink� to the bottom. Write a test program that reads
 *      in ten double numbers, invokes the method, and displays the sorted numbers.
 *
 *
 *input: 1,0 2,0 3,0 5,8 6,8 1,0 2,0 3,0 5,8 6,8
output: 1.0 1.0 2.0 2.0 3.0 3.0 5.8 5.8 6.8 6.8 
 
 */

import java.util.Scanner;
public class example_7_18_bubble_sort {

	public static void bubbleSort(double[] numbers) {

        boolean change;
        do {
            change = false;
            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    change = true;
                 }
            }

        } while (change);

    }
	
	
	
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int size = 10;
        double[] numbers = new double[size];
        System.out.print("Enter 10 double values: ");

       //input of array
        for (int i = 0; i < numbers.length; i++) 
        	numbers[i] = scnr.nextDouble();            
                
     // Invoke bubblesort method
     		bubbleSort(numbers);

     		// display the result
     		for (double res: numbers) {
     			System.out.print(res + " ");
     		}
     		System.out.println();  
    }
}
