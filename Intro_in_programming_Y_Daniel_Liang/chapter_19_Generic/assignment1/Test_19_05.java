package assignment1;
public class Test_19_05 {

	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3};
		System.out.println(Lavruk_19_05.max(numbers));	// 3
	    
		String[] words = {"red", "green", "blue"};		// red
		System.out.println(Lavruk_19_05.max(words));
	    
		Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};		// Circle radius 5.9
		System.out.println(Lavruk_19_05.max(circles));
		
		Integer[] single_number = {4};
		System.out.println(Lavruk_19_05.max(single_number));	// 4

		
	}
	  
	static class Circle implements Comparable<Circle> {
		double radius;
	    
		public Circle(double radius) {
			this.radius = radius;
		}
	    
		@Override
		public int compareTo(Circle c) {
			if (radius < c.radius) 
				return -1;
			else if (radius == c.radius)
				return 0;
			else
				return 1;
		}
	    
		@Override
		public String toString() {
			return "Circle radius: " + radius;
		}
	}

}