import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringOutputStream_StringWriter_PrintWriter {
   public static void main(String[] args) {
      String item = "Shoes";
      int quantity = 12;
      int discount = 35;

      StringWriter itemCharStream = new StringWriter();
      PrintWriter itemOSS = new PrintWriter(itemCharStream);

      itemOSS.println(item + " x" + quantity);
      itemOSS.print(discount + "% off");

      System.out.print(itemCharStream.toString());

      return;
   }
}