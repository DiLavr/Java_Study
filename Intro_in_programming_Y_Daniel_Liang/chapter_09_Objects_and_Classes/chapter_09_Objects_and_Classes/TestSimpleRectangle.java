package chapter_09_Objects_and_Classes;

public class TestSimpleRectangle {
	/** Main method */
	  public static void main(String[] args) {
	    
		  System.out.println("Parameters of Rectangle:\t\t" + " Area\t\t " + " Perimeter" );
		  
		  // Create a Rectangle with Width = 1 and height = 1
		  SimpleRectangle Rectangle1 = new SimpleRectangle();
	    System.out.println("Width = " + Rectangle1.width + ";  height = "  + Rectangle1.height + "\t\t"  + Rectangle1.getArea() + "\t\t" + Rectangle1.getPerimeter());

	    // Create a Rectangle with Width = 4 and height = 40
	    SimpleRectangle Rectangle2 = new SimpleRectangle(4,40);
	    System.out.println("Width = " + Rectangle2.width + ";  height = "  + Rectangle2.height + "\t\t"  + Rectangle2.getArea() + "\t\t" + Rectangle2.getPerimeter());
	    // Create a Rectangle with Width = 3.5 and height = 35.9
	    SimpleRectangle Rectangle3 = new SimpleRectangle(3.5,35.9);
	    System.out.print( "Width = " + Rectangle3.width + ";  height = "  + Rectangle3.height + "\t\t");
	    System.out.print(String.format("%.1f", Rectangle3.getArea()));
	    System.out.print("\t\t" + Rectangle3.getPerimeter());

	
	  }
}

