package Geomenti_objects;

import java.util.ArrayList;

public class PolymorphismExample {
   public static void main(String[] args) {
      ArrayList<Shape> shapesList = new ArrayList<Shape>();

      Circle circle = new Circle(new Point(0.0, 0.0), 1.0);
      shapesList.add(circle);

      Rectangle rectangle = new Rectangle(new Point(0.0, 0.0), new Point(2.0, 2.0));
      shapesList.add(rectangle);

      for (Shape shape : shapesList) {
         System.out.println("Shape is: " + shape.getClass() + " and area is: " + shape.computeAreaPoint());
      }
      
      return;
   }
}