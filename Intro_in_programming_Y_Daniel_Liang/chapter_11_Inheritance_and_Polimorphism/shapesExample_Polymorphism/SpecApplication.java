package shapesExample_Polymorphism;

public class SpecApplication {
	public static void main(String[] args) {
		GeometricObject[] go = makeObjectsArray();

		for (GeometricObject g : go) {
			System.out.println("Color: " + g.getColor());
			System.out.println("Area: " + g.getArea());
			System.out.println("Perimeter: " + g.getPerimeter());
		}

	}

	public static GeometricObject[] makeObjectsArray() {
		GeometricObject[] geomObjects = new GeometricObject[6];
		geomObjects[0] = new Circle();
		geomObjects[1] = new Circle(3, "green", true);
		geomObjects[2] = new Rectangle(2, 4);
		geomObjects[3] = new Rectangle(5, 3);
		geomObjects[4] = new Triangle(3, 4, 5);
		geomObjects[5] = new Square(6);
		return geomObjects;
	}

}
