import java.util.Scanner;
import java.io.FileInputStream; //allows a programmer to read bytes from a file
import java.io.IOException; // provides mechanisms for exception throwing and handling, which are discussed in more detail elsewhere

public class Reading_num_from_file {
   public static void main (String[] args) throws IOException {

      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int fileNum1 = 0;                      // Data value from file
      int fileNum2 = 0;                      // Data value from file

      // Try to open file
      System.out.println("Opening file myNum.txt.");
	  /* creates a file input stream and opens the file denoted by the String literal for reading
	   * Note that FileInputStream's constructor allows a programmer to specify a file using a String variable as well
(e.g., fileByteStream = new FileInputStream(fileStr);).	   */
      fileByteStream = new FileInputStream("myNum.txt");
      inFS = new Scanner(fileByteStream);
         // File is open and valid if we got this far (otherwise exception thrown)
      // myNum.txt should contain two integers, else problems
      System.out.println("Reading two integers.");
      /*The FileInputStream class only supports a basic byte stream, and thus the statement 
       * inFS = new Scanner(fileByteStream); 
       * creates a new Scanner object using the fileByteStream object
       */
      fileNum1 = inFS.nextInt();
      fileNum2 = inFS.nextInt();

      // Output values read from file
      System.out.println("num1: " + fileNum1);
      System.out.println("num2: " + fileNum2);
      System.out.println("num1+num2: " + (fileNum1 + fileNum2));

      // Done with file, so try to close it
      System.out.println("Closing file myNum.txt.");
      fileByteStream.close(); // When done using the stream, the program closes the file (and input stream) using fileByteStream.close().

      return;
   }
}