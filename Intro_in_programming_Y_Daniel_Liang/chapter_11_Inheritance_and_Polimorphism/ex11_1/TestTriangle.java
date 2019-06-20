package ex11_1;
import java.util.Scanner;

public class TestTriangle	
{
public static void main (String [ ] args)	
{	
	Triangle Triangle = new Triangle(1,1,1);
	Triangle.setColor("blue");
	Triangle.setFilled(false);
System.out.println(" \t Showing the Default Triangle");
System.out.println("Triangle Sides are "  + Triangle.toString());	
System.out.format("Triangle Area is %.3f%n ", Triangle.getArea());
System.out.println("Triangle Perimeter is " +  Triangle.getPerimeter());
//System.out.println(Triangle.toStrings());
System.out.println("Color " + Triangle.color);
System.out.println("Boolean Value " + Triangle.isFilled());	

// Input user's value
System.out.println("");	
	Scanner input = new Scanner(System.in);
	System.out.println(" \t Please input the Sides of the Triangle: (input format --> Side 1 'space' Side 2 'space' Side 3 ENTER) ");
	double ValueSide1 = input.nextDouble();
	double ValueSide2 = input.nextDouble();
	double ValueSide3 = input.nextDouble();
	
	System.out.println("Please input the color of the Triangle");
	String ValueColor = input.next();
	
System.out.print("Is the triangle filled? true/false: ");
String isFilledString = input.next();
boolean isFilled = (isFilledString.equals("true"));
	
	Triangle Triangleinput = new Triangle (ValueSide1,ValueSide2,ValueSide3);
	Triangleinput.setColor(ValueColor);
	Triangleinput.setFilled(isFilled);
	
	input.close();
		
System.out.println("Triangle Sides are "  + Triangleinput.toString());	
System.out.format("Triangle Area is %.3f%n ", Triangleinput.getArea());
System.out.println("Triangle Perimeter is " +  Triangleinput.getPerimeter());
System.out.println("Color " + Triangleinput.getColor());
System.out.println("Boolean Value " + Triangleinput.isFilled()); 

} 
}
