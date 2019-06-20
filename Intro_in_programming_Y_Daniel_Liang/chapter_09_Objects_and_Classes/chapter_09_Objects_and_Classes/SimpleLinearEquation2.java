package chapter_09_Objects_and_Classes;
/*
(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e
cx + dy = f
x =
ed - bf
ad - bc
y =
af - ec
ad - bc
The class contains:
Private data fields a, b, c, d, e, and f.
A constructor with the arguments for a, b, c, d, e, and f.
Six getter methods for a, b, c, d, e, and f.
A method named isSolvable() that returns true if ad - bc is not 0.
Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that �The equation has no solution.� See Programming
Exercise 3.3 for sample runs.
 * 
 * 
 */


public class SimpleLinearEquation2 {
	double a,b,c,d,e,f;
	 

	  /** A constructor for the arguments for a, b, c, d, e, and f. */
	  SimpleLinearEquation2(double newA, double newB, double newC, double newD, double newE, double newF) {
	    a = newA;
	    b = newB;
	    c = newC;
	    d = newD;
	    e = newE;
	    f = newF;}

	 boolean isSolvable() {
		 if ((a*d - b*c)!=0) 
		 return true;
		 else
			 return false;
	 }  

		  /** Return x of this linear equations */
	  double getX() {
	    return (e*d - b*f) / (a*d - b*c);
	  }
	  
	  /** Return y of linear equations */
	  double getY() {
		    return (a*f-e*c)/(a*d - b*c);
		  }
	  }

