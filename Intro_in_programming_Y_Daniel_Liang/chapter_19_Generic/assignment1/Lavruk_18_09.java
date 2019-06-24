package assignment1;

import java.util.Scanner;
public class Lavruk_18_09 {

	public static String reverseDisplay(String input ){
        System.out.println (reverse(input));
        return input;
    }
	
	
	private static String reverse(String input) {
				if (input.length() <= 1)
			return input;
		String left = input.substring(0, input.length()/2);
		String right = input.substring(input.length()/2, input.length());
		return reverse(right) + reverse(left);
		
	}
	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		System.out.print("Input your string, that should be reversed: ");

		String s = scrn.nextLine();
		
		scrn.close();
		reverseDisplay(s);
					}		
	
	
	}


