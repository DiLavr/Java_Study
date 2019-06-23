package chapter_18_Recursion;
/** --------> Listing 18.1 <--------------
 * 
 * 0! = 1;
 * n! = n * (n-1)!; n>0
 * 
 * 
 * �������� ���������� ���� �� ���� ����� �������:
 * 
 * if(n==0)
 * 	returt 1;
 * 		else 
 * 			returt n * factorial(n-1);
 * 
 * @author Cosmopus
 *
 */
import java.util.Scanner;;
public class ComputeFactorial {

	//Return factorial for the input number - recursion
	public static long factorial(int n) {
		 if(n==0)
			 return 1;
			  		else 
			 			return n * factorial(n-1); 
		
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a nonnegative intefer: ");
	int n = input.nextInt();
	
	input.close();
	
	// Display Factorial
	System.out.println("Factorial of " + n + " is " + factorial(n));
	
}
	
	
}
