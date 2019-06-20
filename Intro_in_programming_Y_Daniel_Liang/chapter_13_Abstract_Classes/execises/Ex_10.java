/**
 * 
 (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal
if their areas are the same. Draw the UML diagram that involves Rectangle,
GeometricObject, and Comparable.
 * 
 */

package execises;

import lecture.Poligon;

public class Ex_10 {

	public static void main(String[] args) {

	
		Rectangle r1 = new Rectangle(3, 5, "blue", true);
		Rectangle r2 = new Rectangle(5, 3, "gray", false);
		Rectangle r3 = new Rectangle(3.1, 5, "blue", true);

		System.out.println(  "Rectangle1 is \n" + r1.toString() + (r1.equals(r2) ? "" : "not ") +
			"equal to Rectangle2, \n" + r2.toString() + "\nbecause their area are the same\n");

		System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
			"equal to Rectangle3, because their area are no the same");
		
        System.out.println("(r1.equals(r2)): " + r1.equals(r2));
        System.out.println("r1.compareTo(r2): " + r1.compareTo(r2));
		
    }

    private static class Rectangle extends Poligon implements Comparable<Rectangle> {
        private double width;
        private double height;

        @SuppressWarnings("unused")
		public Rectangle() {}

        @Override /** Implement compareTo method */
    	public int compareTo(Rectangle o) {
    		if (getArea() > o.getArea())
    			return 1;
    		else if (getArea() < o.getArea())
    			return -1;
    		else
    			return 0;
    	}
        @Override /** Return true if both objects are equal */
    	public boolean equals(Object o) {
    		return this.compareTo((Rectangle)o) == 0;
    	}

        
        @Override /** Return toString */
    	public String toString() {
    		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
    			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n";
    	}
        

		@SuppressWarnings("unused")
		public Rectangle(
                double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(double width, double height, String color, boolean filled) {
            this.width = width;
            this.height = height;
            setColor(color);
            setFilled(filled);
        }
/** GET & SET for width & height */
          @SuppressWarnings("unused")
		public double getWidth() {return width;}   
          @SuppressWarnings("unused")
		public void setWidth(double width) {this.width = width;}
          @SuppressWarnings("unused")
		public double getHeight() {return height;}
          @SuppressWarnings("unused")
		public void setHeight(double height) {this.height = height;}

        /** Return area */
        public double getArea() {
            return width * height;
        }

        /** Return Perimeter */
        public double getPerimeter() {
            return 2 * (width + height);
        }

    }

}