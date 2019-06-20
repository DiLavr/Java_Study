package chapter_03_Arrays_Basic;

import java.util.Scanner;

public class Trueorfalse {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean isLarge = false;
      boolean isNeg   = false;
      int  userNum = 0;

      System.out.print("Enter any integer: ");
      userNum = scnr.nextInt();

      if ((userNum < -100) || (userNum > 100)) {
         isLarge = true;
      }
      else {
         isLarge = false;
      }

      // Alternative way to set a Boolean variable
      isNeg = (userNum < 0);

      System.out.print("(isLarge: " + isLarge);
      System.out.println(" isNeg: " + isNeg + ")");

      System.out.print("You entered a ");
      if (isLarge && isNeg) {
         System.out.println("large negative number.");
      }
      else if (isLarge && !isNeg) {
         System.out.println("large positive number.");
      }
      else {
         System.out.println("small number.");
      }

      return;
   }
}