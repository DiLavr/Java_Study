package Geomenti_objects;

import java.awt.Graphics2D;

public class TestShapes {
	   public static void main(String[] args) {
	      Circle circle1 = new Circle(new Point(1.0, 1.0), 1.0);
	      Circle circle2 = new Circle(new Point(1.0, 1.0), 2.0);
	      Shape rectangle = new Rectangle(new Point(0.0, 1.0), 1.0, 1.0);
	      Square squere1 = new Square(4);

	      // Print areas
	      System.out.printf("Area of circle 1 is: %.2f \n", circle1.computeArea());
	      System.out.printf("Area of circle 2 is: %.2f \n", circle2.computeArea());
	      System.out.printf("Area of rectangle is: %.2f \n", rectangle.computeArea());
	      System.out.println();
	      
	      // Print positions
	            
//	      System.out.println("Circle 1 is at: (" + circle1.getPosition().getX() + 
//	                         ", " + circle1.getPosition().getY() + ")");
//	      
//	      System.out.println("Rectangle
	      
	      System.out.print("Circle1");
	      circle1.printPosition();     //  is at: (" + rectangle.getPosition().getX() + ", " + rectangle.getPosition().getY() + ")");
	      System.out.print("Rectangle");
	      rectangle.printPosition(); //  is at: (" + rectangle.getPosition().getX() + ", " + rectangle.getPosition().getY() + ")");
	      
	      System.out.println();
	      
	      // Move shapes
	      circle1.setPosition(new Point(3.0, 1.0));
	      rectangle.movePositionRelative(new Point(1.0, 1.0));
	      
	      // Print positions
	      System.out.print("Circle1");
	      circle1.printPosition();     
	      System.out.print("Rectangle");
	      rectangle.printPosition();
	      System.out.println();
	      
	      //Print Perimeter
	      
	      System.out.printf("Circle1 perimeter: %.2f \n",circle1.computePerimeter());
	      System.out.printf("Rectangle perimeter: %.2f", rectangle.computePerimeter());
	      
	      System.out.println();
	      
	     // squere1.draw(Graphics2D);
	     

	      return;
	   }
	}
