package chapter_18_Recursion;
/** --------> Listing 18.2.6 <--------------
 * 
1 + 2 + 3 + 4 + n - growing recurcion
 * 
 * @author Cosmopus
 *
 */
import java.util.Scanner;;
public class ComputeNgrowing_recurtion {

	//Return factorial for the input number - recursion
	public static long power(int n) {
					
				 if (n==1) 
							 return 1;
			  		else 
			 			return n + power(n-1); //recursion
			}
	
	public static double sumSeries(double m ) {
		if (m==1)
			return 1;
		else 
			return (1/m) + sumSeries(m-1);
		
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("input n for this line -  (1 + 2 + 3 + ... + n): ");
	int n = input.nextInt();

	input.close();
	
	// Display Factorial
	System.out.println(" sum of line (1 + 2 + 3 + ... + " + n + "): " + power(n));
	
	//System.out.println(sumSeries(15));
	
	}
}
