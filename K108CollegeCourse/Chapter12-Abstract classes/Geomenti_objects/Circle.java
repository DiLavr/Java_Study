package Geomenti_objects;

public class Circle extends Shape {

	   private double radius;

	   public Circle(Point center, double radius) {
	      this.radius = radius;
	      this.position = center;
	   }

	   @Override // -------> перевисывает метод в материнском классе(!)
	   public double computeArea() {
	      return (Math.PI * Math.pow(radius, 2));
	   }
	   public double computeAreaPoint() { //пришлось добавить изза теста класса - полиморфизм пример
		      return (Math.PI * Math.pow(radius, 2));
		   }
	   
	   @Override
	   public double computePerimeter() {
		   return (2*Math.PI * radius);
		
	}
	   
	   
	}
