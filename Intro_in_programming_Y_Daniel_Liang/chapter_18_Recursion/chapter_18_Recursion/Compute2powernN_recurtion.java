package chapter_18_Recursion;
/** --------> Listing 18.2.4 <--------------
 * 
Power number using recurcion
 * 
 * @author Cosmopus
 *
 */
import java.util.Scanner;;
public class Compute2powernN_recurtion {

	//Return factorial for the input number - recursion
	public static long power(int n) {
					
				 if (n==1) 
							 return 2;
			  		else 
			 			return 2 * power(n-1); //recursion
		
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What power of 2 do u want, put the int please:");
	int n = input.nextInt();
	
	input.close();
	
	// Display Factorial
	System.out.println("2 power " + n + " is " + power(n));
	
}
	
	
}
