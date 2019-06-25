import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Exeptions_in_Intup_output {
	
	 /* Method closes a FileReader. 
    Prints exception message if closing fails */
 public static void closeFileReader(FileReader fileName) {
    try {
       if (fileName != null) { // Ensure "file" references a valid object
          System.out.println("Closing file.");
          fileName.close(); // close() may throw IOException if fails
       }
    } catch (IOException closeExcpt) {
       System.out.println("Error closing file: " + closeExcpt.getMessage());
    }

    return;
 }
	
	
	
	
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      /*
	       * The FileReader class provides an input stream 
	       * that allows a programmer to read characters from the file specified via FileReader's constructor.
	       */
	      FileReader fileCharStream = null; // File stream for reading chars
	      String fileName = "";             // User defined file name
	      int charRead = 0;                 // Data read from file

	      // Get file name from user
	      System.out.print("Enter a valid file name: ");
	      fileName = scnr.next();

	      try {
	         // Prompt user for input
	         System.out.println("Opening file " + fileName + ".");
	         fileCharStream = new FileReader(fileName); // May throw FileNotFoundException

	         // Use file input stream
	         
	         System.out.print("Reading character values: ");
	         
	         while (charRead != -1) {             // -1 means end of file has been reached
	            charRead = fileCharStream.read(); // May throw IOException
	            System.out.print(charRead + " ");
	         }      
	      } catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
	      //вместо этой грамосткой фигуры по закрытию файла мы можем это вынести в метод closeFileReader
	         // Done with file, so try to close it
//	         try {
//	         if (fileCharStream != null) {
//	            System.out.println("\nClosing file " + fileName + ".");
//	            fileCharStream.close(); // close() may throw IOException if fails,close() method for terminating the stream and closing the file
//	         }
//	      } catch (IOException excpt) {
//	         System.out.println("Caught IOException: " + excpt.getMessage());	      } 
	      finally {
			closeFileReader(fileCharStream); //// Ensure file is closed!
		}

	      return;
	       }
	}