package chapter_18_Recursion;
/** --------> Listing 18.2 <--------------
 * ����� ����� ��������
1,2,3,5,8,13,21 � �.�.
 * 
 * @author Cosmopus
 *
 */
import java.util.Scanner;;
public class ComputeFibonacci {

	//Return factorial for the input number - recursion
	public static long fib(long n) {
		if (n==0) //base case
			return 0;
		else if (n==1)  //base case
			return 1;
			else // reduction and recursive call
				return fib(n-1) + fib(n -2);
				}
			
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter index for Fibonacci number: ");
	int n = input.nextInt();
	
	input.close();
		
	// Display Fibonacci
	System.out.println("The Fibonacci number with index: " + n + " is: " + fib(n));
	

	
	}
}
