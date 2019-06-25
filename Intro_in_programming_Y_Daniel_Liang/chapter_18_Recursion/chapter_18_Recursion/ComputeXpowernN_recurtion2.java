package chapter_18_Recursion;
/** --------> Listing 18.2.5 <--------------
 * 
x power n using recursion
 * 
 * @author Cosmopus
 *
 */
import java.util.Scanner;;
public class ComputeXpowernN_recurtion2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter int: ");
	int x = input.nextInt();
	System.out.println("Enter power for " + x);
	int n = input.nextInt();
	
	input.close();
	
	// Display Factorial
	System.out.println(x + " power " + n + " is: " + power(x,n));
	
	}
	
	//Return factorial for the input number - recursion
	public static long power(int x, int n) {
					
				 if (n==1) 
							 return x;
			  		else 
			 			return x * power(x, n-1); //������ �� ��������
			}
}
