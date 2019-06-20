/**
 * 
 * (The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable inter
faces. Assume that all eight sides of the octagon are of equal length. The area can
be computed using the following formula:
area = (2 + 4/22)* side * side
 */


package execises;
import lecture.Poligon;

public class Octagon extends Poligon implements Cloneable, Comparable<Octagon> {
private double side;

public Octagon() {
}

/** Construct a Octagon of a specified side */
public Octagon(double side) {
this.side = side;
}

/** Set a new specified side */
public void setSide(double side) {
this.side = side;
}

/** Return side */
public double getSide() {
return side;
}

@Override /* Return the area of this Octagon */
public double getArea() {
return (2 + 4 / Math.sqrt(2)) * side * side;
}

@Override /* Return the perimeter of this Octagon */
public double getPerimeter() {
return 8 * side;
}

@Override /** Implement compareTo method */
public int compareTo(Octagon o) {
if (getArea() > o.getArea())
	return 1;
else if (getArea() < o.getArea())
	return -1;
else
	return 0;
}

@Override /** Override the protected clone in method defined
in the Object class, and strengthen its accessiblity */
public Object clone() throws CloneNotSupportedException {
return super.clone();
}

@Override /** Retrun a String description of this Octagon object*/
public String toString() {
return super.toString() + "\nArea: " + getArea() + 
	"\nPerimeter: " + getPerimeter();
    }
}

