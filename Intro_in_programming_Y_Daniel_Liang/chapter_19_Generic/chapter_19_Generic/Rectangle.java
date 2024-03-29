package chapter_19_Generic;
	

public class Rectangle extends GeometricObject {
	private double length;
	private double width;

	public Rectangle() {
		super("red", true);
		length = 2;
		width = 3;
	}

	public Rectangle(double length, double width) {
		this();
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}


	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle:" + "\nlength: " + length + "\nwidth: " + width
				+ "\n" + super.toString();
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle);
		System.out.println("rectangle area: " + rectangle.getArea());
		System.out.println("rectangle perimeter: " + rectangle.getPerimeter());
	}

}