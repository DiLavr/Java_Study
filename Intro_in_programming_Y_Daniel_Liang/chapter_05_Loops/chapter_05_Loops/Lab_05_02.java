package chapter_05_Loops;
/*
 * SAMPLE RUN:

Input the amount: 100

Input the annual interest rate (e.g., 5 for 5%): 5

Input the number of months: 6

OUTPUT:

The balance after 6 months is 608.81
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Lab_05_02 {
    public static void main(String[] args) {
    	 Scanner scnr = new Scanner(System.in);
        int dollars = 0; 
    	int interestRate = 0;
    	int num_of_month = 0;
    	double balance = 0;
      	 	
    	    	//Input user values
    	System.out.println("Input the amount: ");
    	dollars = scnr.nextInt();
    	System.out.println("Input the annual interest rate (e.g., 5 for 5%): ");
    	interestRate = scnr.nextInt();
    	System.out.println("Input the number of months: ");
    	num_of_month = scnr.nextInt();
    	
    	final double monthRate = 1+((interestRate * 0.01)/12) ; //monthRate
    	
    	//solution
    	for (int i=0; i < num_of_month; ++i) 
    	{    	    	balance = (dollars + balance) * monthRate;      	    	}
    	
    	scnr.close();
    	
        	//Output
    	System.out.print("The balance after " + num_of_month + " months is "  );
    	
    	System.out.printf("%.2f", balance);
    	
    	return;
    	}
    }