import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Reading_from_file_to_array {
	   public static void main(String[] args) throws IOException {
		      FileInputStream fileByteStream = null; // File input stream
		      Scanner inFS = null;                   // Scanner object
		      int fileNum = 0;                       // Data value from 
		      // Try to open file
		  System.out.println("Opening file toArray.txt");
	      fileByteStream = new FileInputStream("toArray.txt");
	      inFS = new Scanner(fileByteStream);

	      // File is open and valid if we got this far (otherwise exception thrown)
	      System.out.println("Reading and printing numbers.");
	      fileNum = inFS.nextInt();

	      while (inFS.hasNextInt()) {
	         System.out.println("num: " + fileNum);

	         fileNum = inFS.nextInt();
	      }
	      System.out.println("num: " + fileNum);

	      // Done with file, so try to close it
	      System.out.println("Closing file toArray.txt.");
	      fileByteStream.close(); // close() may throw IOException if fails

	      return;
	   }
	}
