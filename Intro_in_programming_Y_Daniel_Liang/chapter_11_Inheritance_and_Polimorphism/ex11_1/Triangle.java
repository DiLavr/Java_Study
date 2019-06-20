package ex11_1;

public class Triangle extends GeometricObject
{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// No-arg constructor that creates the default triangle with 1.0 sides
	public Triangle( ) {}
	
	
	// Constructor that creates a triangle with specified side1, side2, and side3
public Triangle (double side1, double side2, double side3)
{this.side1=side1; this.side2=side2; this.side3=side3;}

//Create accessor methods for all three data fields
public double getSide1( )  {return side1;}
public double setSide2( )  {return side2;}
public double setSide3( )  {return side3;}

public double getPerimeter( ) { return side1+side2+side3; }

// Formula of area from example 2.19 ePerson book
public double getArea() {
   double  s = getPerimeter() / 2;
    return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3))); }

public String toString( ) { return "Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = " + side3;  }

}

