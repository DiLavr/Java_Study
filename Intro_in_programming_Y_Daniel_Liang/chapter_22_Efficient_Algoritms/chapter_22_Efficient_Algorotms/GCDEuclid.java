package chapter_22_Efficient_Algorotms;

import java.util.Scanner;

public class GCDEuclid {
  /** Find gcd for intergers m and n */
  public static int gcd(int m, int n) {
    if (m % n == 0)
      return n;
    else
      return gcd(n, m % n);
  }

  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter first integer: ");
    int m = input.nextInt();
    System.out.print("Enter second integer: ");
    int n = input.nextInt();

    System.out.println("The greatest common divisor for " + m +
      " and " + n + " is " + gcd(m, n));
    System.out.println(m + " / " + gcd(m, n) + " = " + m/gcd(m, n));
    System.out.println(n + " / " + gcd(m, n) + " = " + n/gcd(m, n));
    
    input.close();
  }
}
