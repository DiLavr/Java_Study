package chapter_09_Objects_and_Classes;

import java.util.Scanner;
public class TestQuadraticEquation {
	
	/** Main method */
	  public static void main(String[] args) {

		// Input values for a, b, and c  
		  
		  Scanner scnr = new Scanner(System.in);
		  System.out.println("Please enter values for a, b, and c");
	
		  double valueA = scnr.nextDouble();
		  double valueB = scnr.nextDouble();
		  double valueC = scnr.nextDouble();
		  
	    // Create a QuadraticEquation with values that was inputed by a user
		 
		 SimpleQuadraticEquation root1 = new SimpleQuadraticEquation(valueA, valueB, valueC);
		 System.out.println("Discriminant is " + root1.getDiscriminant());
		 if (root1.getDiscriminant() == 0)
	          System.out.println( "\tThere is only one Root: "   + root1.getRoot1());
		 else if (root1.getDiscriminant()>0)
	    	  System.out.println("\tRoot 1: "+root1.getRoot1() +"\t Root 2: " +  root1.getRoot2());
		 else System.out.println("\tThe equation has no roots.");    
	} 
}
