package chapter_09_Objects_and_Classes;

import java.util.Scanner;
public class TestLinearEquation {
	
	/** Main method */
	  public static void main(String[] args) {

		// Input values for a, b, c, d, e, and f 
		  
		  Scanner scnr = new Scanner(System.in);
		  System.out.println("Please enter values  for a, b, c, d, e, and f");
	
		  double valueA = scnr.nextDouble();
		  double valueB = scnr.nextDouble();
		  double valueC = scnr.nextDouble();
		  double valueD = scnr.nextDouble();
		  double valueE = scnr.nextDouble();
		  double valueF = scnr.nextDouble();
		  
	    // Create a Linear Equationn with values that was inputed by a user
		  
		  SimpleLinearEquation LinearEquation = new SimpleLinearEquation(valueA, valueB, valueC, valueD, valueE, valueF);
		 		 if (LinearEquation.isSolvable())
	          System.out.println( "\tX is "   + LinearEquation.getX() + "\t Y is " + LinearEquation.getY());
		 				 else System.out.println("\tThe equation has no solution.");    
	} 
}
