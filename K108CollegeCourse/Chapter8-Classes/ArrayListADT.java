/*
 * Modify the existing ArrayLists's contents, by erasing 200, 
 * then inserting 100 and 102 in the shown locations.
 *  Use ArrayList's remove() and add() only. Sample output of below program:
100 101 102 103 
 * 
 */

import java.util.ArrayList;

public class ArrayListADT {

   public static void printArray(ArrayList<Integer> numsList, int numOfElem) {
      int i = 0;

      for (i = 0; i < numOfElem; ++i) {
         System.out.print(numsList.get(i));
         System.out.print(" ");
      }

      System.out.println("");
   }

   public static void main (String [] args) {
      ArrayList<Integer> numsList = new ArrayList<Integer>();
      int numOfElem = 4;

      numsList.add(new Integer(101));
      numsList.add(new Integer(200));
      numsList.add(new Integer(103));

      
      numsList.remove(1); // remove 200
      numsList.add(0, new Integer(100));
      numsList.add(2, new Integer(102));
      /* Your solution goes here  */

      printArray(numsList, numOfElem);

      return;
   }
}