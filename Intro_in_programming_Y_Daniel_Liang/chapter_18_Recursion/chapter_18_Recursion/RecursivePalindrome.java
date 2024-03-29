package chapter_18_Recursion;
/**
 * 
 * Two overloaded isPalindromemethods are defined. The first, isPalindrome(String s),
checks whether a string is a palindrome, and the second, isPalindrome(String s, int low,
int high), checks whether a substring s(low..high) is a palindrome. The first method
passes the string s with low = 0 and high = s.length() � 1 to the second method. The
second method can be invoked recursively to check a palindrome in an ever-shrinking substring.
It is a common design technique in recursive programming to define a second method that
receives additional parameters. Such a method is known as a recursive helper method.
Helper methods are very useful in designing recursive solutions for problems involving
strings and arrays. The sections that follow give two more examples.
 * @author owner2
 *
 */
public class RecursivePalindrome {
		
public static boolean isPalindrome(String s) {
return isPalindrome(s, 0, s.length() - 1);
 }
// recursive helper method
private static boolean isPalindrome(String s, int low, int high) {
if (high <= low) // Base case
	return true;
 else if (s.charAt(low) != s.charAt(high)) // Base case
 return false;
 else
 return isPalindrome(s, low + 1, high - 1);
 }

public static void main(String[] args) {
System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
 System.out.println("Is noon a palindrome? "  + isPalindrome("noon"));
 System.out.println("Is a a palindrome? " + isPalindrome("a"));
 System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
 System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
 }
}
