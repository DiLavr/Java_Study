/**
 * 
(Sum the areas of geometric objects) Write a method that sums the areas of all the
geometric objects in an array. 
The method signature is:
public static double sumArea(Poligon[] a) 
Write a test program that creates an array of four objects (two circles and two
rectangles) and computes their total area using the sumArea method.


 */

package execises;

import lecture.Poligon;
import lecture.Rectangle;

public class Ex_12 {
	/** Returns the sumArea of the areas in the array 	 */
	public static double sumArea(Poligon[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}

	/** Method main */
	public static void main(String[] args) {
		// Create an array of four objects
		Poligon[] geometricobjectsarray = {new Circle(3), new Circle(8),
			new Rectangle(15, 3), new Rectangle(8, 7)};

		// Display results
		System.out.printf("Total area using the sumArea method in array: %.2f   ", sumArea(geometricobjectsarray));
		
	}

	
}
