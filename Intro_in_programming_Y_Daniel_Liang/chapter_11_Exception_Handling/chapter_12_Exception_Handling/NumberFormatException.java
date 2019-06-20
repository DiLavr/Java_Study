package chapter_12_Exception_Handling;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class NumberFormatException {

/** Main method */
   public static void main(String[] args) {

       // Check number of strings passed

      if (args.length != 3) {
         System.out.println(
          "Usage: java Calculator operand1 operator operand2");
         System.exit(0);
      }
   
  // The result of the operation
      int op1 = 0;
      int op2 = 0;
   
      try {
         op1 = Integer.parseInt(args[0]);
         op2 = Integer.parseInt(args[2]);
      }
         catch (NumberFormatException ex) {

            System.out.println("One of the operands is not a valid integer");
            System.exit(0);
         }

          

   // The result of the operation

      int result = 0;
    

   // Determine the operator

      switch (args[1].charAt(0)) {
            case '+': result = op1 + op2;
            break;
            case '-': result = op1 - op2;
            break;
case '*': result = op1 * op2;
break;
case '/': result = op1 / op2;

      }
// Display result
System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
   }

public String getMessage() {
	// TODO Auto-generated method stub
	return null;
}
}
   

