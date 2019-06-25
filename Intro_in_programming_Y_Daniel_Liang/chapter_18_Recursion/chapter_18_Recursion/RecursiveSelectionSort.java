package chapter_18_Recursion;
/**
■ Find the smallest element in the list and swap it with the first element.
■ Ignore the first element and sort the remaining smaller list recursively;
24
Two overloaded sort methods are defined. The first method, sort(double[] list), sorts
an array in list[0..list.length - 1] and the second method, sort(double[] list,
int low, int high), sorts an array in list[low..high]. The second method can be
invoked recursively to sort an ever-shrinking subarray.
 * @author owner2
 *
 */

import java.util.Arrays;

public class RecursiveSelectionSort {
	public static void main(String[] args) {
		
		double[] list1  =  {2, 3, 5, 8, 1, 9};
		sort(list1);
		
		for (int i=0; i < list1.length; i++ )
			System.out.print(list1[i] + " ");
		
		System.out.println();
		
	
		//output list1	
		System.out.println(Arrays.toString(list1));
		
		
	}

 public static void sort(double[] list) {
 sort(list, 0, list.length - 1); // Sort the entire list
 }
  
 
 
private static void sort(double[] list, int low, int high) {
 if (low < high) {
 // Find the smallest number and its index in list[low .. high]
 int indexOfMin = low;
 double min = list[low];
 for (int i = low + 1; i <= high; i++) {
 if (list[i] < min) {
 min = list[i];
 indexOfMin = i;
 					}
 }
//Swap the smallest in list[low .. high] with list[low]
 list[indexOfMin] = list[low];
 list[low] = min;
  // Sort the remaining list[low+1 .. high]
  sort(list, low + 1, high);
  	}
  }

}