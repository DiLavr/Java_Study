package chapter_19_Generic;

public class BoundeTypeDemo {
public static void main(String[] args) {
	Rectangle rectangle = new Rectangle(2,2);
	Circle circle = new Circle(2);
		
	System.out.println("Circle area: " + circle.getArea() + "; " + " Rectangle area: " + rectangle.getArea());
	System.out.println("Is it same Area - " + equalArea(rectangle, circle));	
}
public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
	return object1.getArea() == object2.getArea();
}
}
  