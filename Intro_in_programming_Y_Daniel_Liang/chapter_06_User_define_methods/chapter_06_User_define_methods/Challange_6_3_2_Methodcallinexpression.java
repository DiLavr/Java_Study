package chapter_06_User_define_methods;
/*
 * Assign to maxSum the max of (numA, numB) PLUS the max of 
 * (numY, numZ). 
 * Use just one statement. 
 * Hint: Call findMax() twice in an expression. 
 * 
 */

public class Challange_6_3_2_Methodcallinexpression {
   public static double findMax(double num1, double num2) {
      double maxVal = 0.0;

      // Note: if-else statements need not be understood to
      // complete this activity
      if (num1 > num2) { // if num1 is greater than num2,
         maxVal = num1;  // then num1 is the maxVal.
      }
      else {             // Otherwise,
         maxVal = num2;  // num2 is the maxVal.
      }
      return maxVal;
   }

   public static void main(String [] args) {
      double numA = 5.0;
      double numB = 10.0;
      double numY = 3.0;
      double numZ = 7.0;
      double maxSum = 0.0;

      /* Your solution goes here  */
      maxSum = findMax(numA,numB) +  findMax(numY,numZ); 
      
      System.out.print("maxSum is: " + maxSum);

      return;
   }
}