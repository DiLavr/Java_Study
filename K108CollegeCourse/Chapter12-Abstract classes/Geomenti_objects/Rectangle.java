package Geomenti_objects;

public class Rectangle extends Shape {

	private Point lowerLeft, upperRight;   
	private double length, height;

	   Rectangle(Point lowerLeft, Point upperRight) {
		      this.lowerLeft = lowerLeft;
		      this.upperRight = upperRight;
		   }
	   
	   
	   Rectangle(Point upperLeft, double length, double height) {
	      this.position = upperLeft;
	      this.length = length;
	      this.height = height;
	   }


	@Override
	   public double computeArea() {
		  return (length * height);
	   }
	   public double computeAreaPoint() {
		      double length = 0.0;
		      double height = 0.0;
	
		      length = upperRight.getX() - lowerLeft.getX();
		      height = upperRight.getY() - lowerLeft.getY();
			
			  return (length * height);
		   }
	
	
	
	   @Override
	   public double computePerimeter() {
		   return (2*(length+height));
	   }
	   }
