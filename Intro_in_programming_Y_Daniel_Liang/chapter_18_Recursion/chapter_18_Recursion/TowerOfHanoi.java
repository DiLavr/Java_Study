package chapter_18_Recursion;
/**
 * The Tower of Hanoi problem can be decomposed into three subproblems
 * The following method moves n disks from the fromTower to the toTower with the assistance of the auxTower:
 * 
void moveDisks(int n, char fromTower, char toTower, char auxTower)

The algorithm for the method can be described as:

if (n == 1) // Stopping condition
Move disk 1 from the fromTower to the toTower;
else {
moveDisks(n - 1, fromTower, auxTower, toTower);
Move disk n from the fromTower to the toTower;
moveDisks(n - 1, auxTower, toTower, fromTower);
}
 */

import java.util.Scanner;

 public class TowerOfHanoi {
 /** Main method */
 public static void main(String[] args) {
 // Create a Scanner
 Scanner input = new Scanner(System.in);
 System.out.print("Enter number of disks: ");
 int n = input.nextInt();
 
 input.close();

 // Find the solution recursively
 System.out.println("The moves are:");
 moveDisks(n, 'A', 'B', 'C');
 }

 /** The method for finding the solution to move n disks
 from fromTower to toTower with auxTower */
 
 public static void moveDisks(int n, char fromTower, char toTower, char auxTower) { 
 if (n == 1) // Stopping condition --------------> Base case
 System.out.println("Move disk " + n + " from " +
 fromTower + " to " + toTower);
 else {
 moveDisks(n - 1, fromTower, auxTower, toTower); // ---------------> recursion
 System.out.println("Move disk " + n + " from " +
 fromTower + " to " + toTower);
 moveDisks(n - 1, auxTower, toTower, fromTower); // ---------------> recursion
 }
 }
 }
