/**
 * 
 * (The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable inter
faces. Assume that all eight sides of the octagon are of equal length. The area can
be computed using the following formula:
area = (2 + 4/22)* side * side
Draw the UML diagram that involves Octagon, GeometricObject,
Comparable, and Cloneable. Write a test program that creates an Octagon
object with side value 5 and displays its area and perimeter. Create a new object
using the clone method and compare the two objects using the compareTo
method.

 * 
 */

package execises;

public class Ex_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon oc1 = new Octagon(5);
		System.out.println("About Octagon(5): " + oc1.toString());

		// Using the clone method
		System.out.println("Cloning Octagon 1 ------------>");
		Octagon oc2 = (Octagon)oc1.clone();

		// CompareTo method
		System.out.print("oc1.compareTo(oc2): ");
		int result = (oc1.compareTo(oc2));
		if (result == 1)
			System.out.println("Oc1 > Oc2.");
		else if (result == -1)
			System.out.println("Oc1 < Oc2"); 
		else
			System.out.println("Oc1 = Oc2");
	}
}
