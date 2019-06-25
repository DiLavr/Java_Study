import java.util.Scanner;

public class TaxTableTools {

   /** This class searches the 'search' table with a search argument and
       returns the corresponding value in the 'value' table. Variable
       'nEntries' has the number of entries in each table.
   */
   private int [] search =   {   0, 20000, 50000, 100000,  Integer.MAX_VALUE };
   private double [] value = { 0.0,  0.10,  0.20,   0.30,               0.40 };
   private int nEntries;

   // *********************************************************************** 

   // Default constructor 
   
   public TaxTableTools () {
      nEntries  = search.length;  // Set the length of the search table
   } 
   
   // *********************************************************************** 

   // Overloaded constructor
   
//   public TaxTableTools(int oversearch[], double overvalue[]) {
//	search = oversearch;
//	value = overvalue;
//	nEntries = search.length;
//}

   // FIXME: Add an overloaded constructor to load the search and value tables.
   // FIXME: Be sure to set the nEntries value, too.

   // *********************************************************************** 

   // Method to prompt for and input an integer
   
   public int getInteger(Scanner input, String prompt) {
      int inputValue = 0;
      
      System.out.println(prompt + ": ");
      inputValue = input.nextInt();
      
      return inputValue;
   } 

   // *********************************************************************** 

   // Method to get a value from one table based on a range in the other table

   public double getValue(int searchArgument) {
      double result = 0.0;
      boolean keepLooking = true;
      int i = 0;

      while ((i < nEntries) && keepLooking) {
         if (searchArgument <= search[i]) {
            result = value[i];
            keepLooking = false;
         }
         else {
            ++i;
         }
      } 

      return result;
   } 
} 