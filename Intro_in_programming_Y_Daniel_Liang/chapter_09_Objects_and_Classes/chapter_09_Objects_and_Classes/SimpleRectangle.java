package chapter_09_Objects_and_Classes;

public class SimpleRectangle {
	double width;
	double height;

	  /** Construct a Rectangle with The default values = 1 */
	SimpleRectangle() {
		width = 1;
		height = 1;
	  }

	  /** Construct a Rectangle with a specified width and height */
	SimpleRectangle(double newwidth, double newheight ) {
		width = newwidth;
		height = newheight;
	    	  }

	  /** Return the area of this Rectangle */
	  double getArea() {
	    return width * height;
	  }

	  /** Return the perimeter of this Rectangle */
	  double getPerimeter() {
	    return 2 * (width + height);
	  }

	}

