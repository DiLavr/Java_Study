package chapter_06_User_define_methods;

import java.util.Scanner;
public class Practice_6_3_4 {

	public static double tempF (double celsius) { 
		return((celsius * 1.8) + 32);	}
	 
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
     
      System.out.println("Enter temperature in Celsius: ");
      double tempC = scnr.nextDouble();
      scnr.close();

      System.out.println(tempC + " Celsius is " + tempF(tempC) + " Fahrenheit");
   }
}

