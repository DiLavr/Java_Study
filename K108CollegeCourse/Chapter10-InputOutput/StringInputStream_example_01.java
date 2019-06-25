
import java.util.Scanner;

public class StringInputStream_example_01 {
   public static void main(String[] args) {
      String item1Info = "Pen 9 4";
      String item2Info = "Mug 11 16";
      String item3Info = "Shoes 25 22";

      
      String item = "";
      int quantity = 0;
      int price = 0;

      Scanner itemISS_01 = new Scanner(item1Info);
      item = itemISS_01.next();
      quantity = itemISS_01.nextInt();
      price = itemISS_01.nextInt();
      System.out.println(item + " x" + quantity);
      System.out.print("Price: " + price+ "\n");
      
      Scanner itemISS_02 = new Scanner(item2Info);
      item = itemISS_02.next();
      quantity = itemISS_02.nextInt();
      price = itemISS_02.nextInt();

      System.out.println(item + " x" + quantity);
      System.out.print("Price: " + price);
      return;
   }
}