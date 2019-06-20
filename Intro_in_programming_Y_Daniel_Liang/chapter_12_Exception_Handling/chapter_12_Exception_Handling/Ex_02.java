

package chapter_12_Exception_Handling;
import java.util.Scanner;
import java.util.*;
public class Ex_02 {
	public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        while (!isValid) {
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();
                isValid = true;
            } 
            catch (InputMismatchException ex) {

                input.nextLine();
                System.out.println("Invalid input..." );
                System.out.print("Enter two integers again: ");
            }
        }
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

