package chapter_18_Recursion;
/**
 * Listing 18.7 gives a program that prompts the user to enter a directory or a file and displays
its size.
 * @author owner2
 *
 */
import java.io.File;
 import java.util.Scanner;

 public class DirectorySize {
 public static void main(String[] args) {
 // Prompt the user to enter a directory or a file
 System.out.print("Enter a directory or a file: ");
 Scanner input = new Scanner(System.in);
 String directory = input.nextLine();
 
 input.close();

 // Display the size
 System.out.println(getSize(new File(directory)) + " bytes");
 }
 
  public static long getSize(File file) {
  long size = 0; // Store the total size of all files
 
  if (file.isDirectory()) { //If the file object represents a directory (line 24), each sub-item (file or sub-directory) in the
	 // directory is recursively invoked to obtain its size (line 28)
  File[] files = file.listFiles(); // All files and sub-directories
  for (int i = 0; files != null && i < files.length; i++) {
  size += getSize(files[i]); // Recursive call
  }
  }
 
  else { // Base case - If the file object represents a fil
  size += file.length(); //the file size is obtained and added to the total size (line 25).
  }
 
  return size;
  }
  }