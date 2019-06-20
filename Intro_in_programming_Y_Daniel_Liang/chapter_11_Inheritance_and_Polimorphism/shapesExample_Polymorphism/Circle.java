package shapesExample_Polymorphism;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super("yellow", false);
		radius = 2.0;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return radius * 2;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// @Override
	public String toString() {
		return "Circle.toString();";
	}

	public static void main(String[] args) {
		// Circle circle = new Circle(4, "grey", true);
		Circle circle = new Circle();
		// circle.setFilled(false);
		// circle.setColor("blue");
		// System.out.println(circle.getColor());
		System.out.println(circle);
		// System.out.println("circle area: " + circle.getArea());
	}

}