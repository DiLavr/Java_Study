package chapter_03_Arrays_Basic;
import java.util.Scanner;
public class lab301 {
	                      
		   public static void main (String [] args) { 
			  Scanner scnr = new Scanner(System.in); // plug in scanner
		      double a, b, c, d, e, f, x, y;
		      System.out.print("Enter a, b, c, d, e, f: ");
		      //input
		      a = scnr.nextDouble();
		      b = scnr.nextDouble();
		      c = scnr.nextDouble();
		      d = scnr.nextDouble();
		      e = scnr.nextDouble();
		      f = scnr.nextDouble();
			
		      scnr.close();
		      // calculating
		     
		      if ((e*d-b*f)!=0 && (a*d - b*c) !=0 ) {
		    	  x = (e*d - b*f) / (a*d - b*c);
		    	  y = (a*f - e*c) / (a*d - b*c);
		    	  System.out.println("x is " + x + " and y is " + y);
		     
		     }
		      else { 	  System.out.println("The equation has no solution.");
			     
		    	   } 
			  }
		   
		   
			
}