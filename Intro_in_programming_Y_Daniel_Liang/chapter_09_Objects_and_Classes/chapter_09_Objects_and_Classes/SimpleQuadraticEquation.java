package chapter_09_Objects_and_Classes;
/*
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
 Private data fields a, b, and c that represent three coefficients.
 A constructor for the arguments for a, b, and c.
 Three getter methods for a, b, and c.
 A method named getDiscriminant() that returns the discriminant, which is
b2 - 4ac.
 The methods named getRoot1() and getRoot2() for returning two roots of
the equation
 * 
 * 
 */


public class SimpleQuadraticEquation {
	double a,b,c;

	  /** A constructor for the arguments for a, b, and c */
	  SimpleQuadraticEquation(double newA, double newB, double newC) {
	    a = newA;
	    b = newB;
	    c = newC;	  }

	  /** Return the discriminant of this Quadratic Equation */
	  	  double getDiscriminant() {
		  return  Math.pow(b, 2) - 4*a*c;	}
 
		  /** Return the root 1 of this Quadratic Equation */
	  double getRoot1() {
	    return ( (b * (-1) + Math.pow(getDiscriminant(), 0.5)) / (2 * a));
	  }
	  
	  /** Return the root 1 of this Quadratic Equation */
	  double getRoot2() {
		    return ( (b * (-1) - Math.pow(getDiscriminant(), 0.5)) / (2 * a));
		  }
	  }

