package lecture;

public class Circle extends Poligon {
	  private double radius;

	  public Circle() {
	  }

	  public Circle(double radius) {
	    this.radius = radius;
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

	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }

	  /** Set a new radius */
	  public void setRadius(double radius) {
	    this.radius = radius;
	  }
	}