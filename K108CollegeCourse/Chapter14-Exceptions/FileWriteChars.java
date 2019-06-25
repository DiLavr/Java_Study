/**
 * Writing to a file with exception handling.
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteChars {
	/* Method closes a FileWriter. 
    Prints exception message if closing fails. */
 public static void closeFileWriter(FileWriter fileName) {
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
    final int NUM_CHARS_TO_WRITE = 10; // Num chars to write to file
    int countVar = 0;                  // Track num chars written so far
    FileWriter fileCharStream = null;  // File stream for writing file
    String fileName = "";              // User defined file name
    char charWrite = 'a';              // Char data written to file

    // Get file name from user
    System.out.print("Enter a valid file name: ");
    fileName = scnr.next();

    try {
       System.out.println("Creating file " + fileName + ".");
       fileCharStream = new FileWriter(fileName); // May throw IOException

       // Use file output stream
       System.out.print("Writing " + NUM_CHARS_TO_WRITE + " characters: ");
       while (countVar < NUM_CHARS_TO_WRITE) {
          fileCharStream.write(charWrite);
          System.out.print(charWrite);

          charWrite++; // Get next char ready
          countVar++;  // Keep track of number chars written
       }
       System.out.println();
    } catch (IOException excpt) {
       System.out.println("Caught IOException: " + excpt.getMessage());
    } finally {
       closeFileWriter(fileCharStream); // Ensure file is closed!
    }

    return;
 }
}