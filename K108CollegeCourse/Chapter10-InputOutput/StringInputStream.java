/**
 * 
 * Чтение строки
 */

import java.util.Scanner;

public class StringInputStream {
   public static void main(String[] args) {
      Scanner inSS = null;              // Input string stream
      String userInfo = "Amy Smith 19"; // Input string
      String firstName = "";            // First name
      String lastName =  "";            // Last name
      int userAge = 0;                  // Age

      // Init scanner object with string
      inSS = new Scanner(userInfo); // creates a Scanner object in which the associated input stream is initialized with a copy of myString. 
      /*Then, the program can extract data from the scanner inSS using the family of next() methods (e.g., next(),
       *  nextInt(), nextDouble(), etc.).
       */

      // Parse name and age values from string
      firstName = inSS.next();
      lastName = inSS.next();
      userAge = inSS.nextInt();

      // Output parsed values
      System.out.println("First name: " + firstName);
      System.out.println("Last name: " + lastName);
      System.out.println("Age: " + userAge);

      return;
   }
}