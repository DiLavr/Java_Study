/**
 * Write a statement that calls the recursive method backwardsAlphabet() and upwardsAlphabet() with parameter startingLetter. 
 * @author Cosmopus
 *
 */

import java.util.Scanner;
public class RecursiveCalls {
	
   public static void backwardsAlphabet(char currLetter) {
      if (currLetter == 'a') {
         System.out.println(currLetter);
      }
      else {
         System.out.print(currLetter + " ");
         backwardsAlphabet(--currLetter);
      }
      return;
   }
   
   public static void upwardsAlphabet(char currLetter) {
	      if (currLetter == 'z') {
	         System.out.println(currLetter);
	      }
	      else {
	         System.out.print(currLetter + " ");
	         upwardsAlphabet(++currLetter);
	      }
	      return;
	   }
   
   

   public static void main (String [] args) {
	  Scanner scnr = new Scanner(System.in);
      char startingLetter;

     System.out.println("Input starting letter for backwards Alphabet: " );
        startingLetter = scnr.next().charAt(0);
     backwardsAlphabet(startingLetter);
      System.out.println("Input starting letter for upwards Alphabet: " );
      startingLetter = scnr.next().charAt(0);
      upwardsAlphabet(startingLetter);
 

      return;
   }
}