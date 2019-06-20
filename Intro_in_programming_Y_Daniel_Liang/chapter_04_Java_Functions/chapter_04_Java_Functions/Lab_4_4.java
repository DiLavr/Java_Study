package chapter_04_Java_Functions;
/*
 * Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.

SAMPLE RUN 1:

Enter string s1: ABCD

Enter string s2: BC

BC is a substring of ABCD

SAMPLE RUN 2:

Enter string s1: ABCD

Enter string s2: BDC

BDC is not a substring of ABCD

 */

import java.util.Scanner;
public class Lab_4_4 {

	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		
		 // prompts the user to enter two strings
		String str1, str2 = ""; 
		System.out.print("Enter string s1: ");
	    str1 = scnr.next();
	    System.out.print("Enter string s2: ");
	    str2 = scnr.next();
	    
	    if (str1.contains(str2)) {	
	    	System.out.println(str2 + " is a substring of " + str1);
	    }
	    else {
	    	System.out.println(str2 + " is not a substring of " + str1);
	    }
	}
}   
	    
		

