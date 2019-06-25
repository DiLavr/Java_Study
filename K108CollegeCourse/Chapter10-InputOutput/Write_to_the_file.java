import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_to_the_file {
   public static void main(String[] args) throws IOException {
      FileOutputStream fileByteStream = null; // File output stream
      PrintWriter outFS = null;               // Output stream

      // Try to open file
      fileByteStream = new FileOutputStream("myoutfile.txt");
      outFS = new PrintWriter(fileByteStream);

      // File is open and valid if we got this far (otherwise exception thrown)
      // Can now write to file
      outFS.println("Hello");
      outFS.println("1 2 3");
      outFS.flush();

      // Done with file, so try to close it
      fileByteStream.close(); // close() may throw IOException if fails
      
      
      

      return;
   }
}