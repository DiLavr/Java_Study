/*
 * The program below calculates a tax rate and tax to pay given an annual salary. 
The program uses a class, TaxTableTools, which has the tax table built in. 
Run the program with annual salaries of 10000, 50000, 50001, 100001 and -1 (to end the program)
 and note the output tax rate and tax to pay.

Overload the constructor.
1. Add to the TaxTableTools class an overloaded constructor that accepts the base salary 
table and corresponding tax rate table as parameters.
2. Modify the main method to call the overloaded constructor with the two tables 
(arrays) provided in the main method. Be sure to set the nEntries value, too.
3. Note that the tables in the main method are the same as the tables in the TaxTableTools class. 
This sameness facilitates testing the program with the same annual salary values listed above.
4. Test the program with the annual salary values listed above.
5. Modify the salary and tax tables
6. Modify the salary and tax tables in the main method to use different salary ranges and tax rates.
7. Use the just-created overloaded constructor to initialize the salary and tax tables.
8. Test the program with the annual salary values listed above.
 * 
 */

import java.util.Scanner;

public class IncomeTaxMain {    
   public static void main (String [] args) { 
      final String PROMPT_SALARY = "\nEnter annual salary (-1 to exit)";
      Scanner scnr = new Scanner(System.in);
      int annualSalary = 0;
      double taxRate = 0.0;
      int taxToPay = 0;
      int i = 0;

      // Tables to use in the exercise are the same as in the TaxTableTools class
//      int [] salaryRange = {   0,  20000, 50000, 100000,  Integer.MAX_VALUE };
//      double [] taxRates = { 0.0,   0.10,  0.20,   0.30,               0.40 };

      // Access the related class
      TaxTableTools table = new TaxTableTools();

      // Get the first annual salary to process
      annualSalary = table.getInteger(scnr, PROMPT_SALARY);

      while (annualSalary >= 0) {
         taxRate = table.getValue(annualSalary);
         taxToPay= (int)(annualSalary * taxRate);     // Truncate tax to an integer amount
         System.out.println("Annual Salary: " + annualSalary + 
                            "\tTax rate: " + taxRate +
                            "\tTax to pay: " + taxToPay);

         // Get the next annual salary
         annualSalary = table.getInteger(scnr, PROMPT_SALARY);
      } 

      return;
   } 
} 