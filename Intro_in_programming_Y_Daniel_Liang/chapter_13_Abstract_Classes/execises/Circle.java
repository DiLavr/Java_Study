package execises;

import lecture.Poligon;

public class Circle
extends Poligon implements Comparable<Circle> {
private double radius;

public Circle() {
}

public Circle(double radius) {
this.radius = radius;
}

public Circle(double radius, String color, boolean filled) {
this.radius = radius;
setColor(color);
setFilled(filled);
}

@Override /** Implement compareTo method */
public int compareTo(Circle o) {
if (this.radius > o.radius)
	return 1;
else if (this.radius < o.radius)
	return -1;
else
	return 0;
}

@Override 
public boolean equals(Object o) {
return this.compareTo((Circle)o) == 0;
}

@Override /** Return area */
public double getArea() {
return radius * radius * Math.PI;
}

/** Return diameter */
public double getDiameter() {
return 2 * radius;
}

@Override /** Return perimeter */
public double getPerimeter() {
return 2 * radius * Math.PI;
}

/** Return radius */
public double getRadius() {
return radius;
}

/** Set a new radius */
public void setRadius(double radius) {
this.radius = radius;
}

@Override /** Implement the toString method */
public String toString() {
return super.toString() + "\nDate created: " + getDateCreated() +
	"\nRadius: " + radius;
}
}