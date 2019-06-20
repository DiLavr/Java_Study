package chapter_03_Arrays_Basic;

public final class CharMatching {
	public static void main (String [] args) {
	      String userInput = "";
	      char firstLetter = '-';

	      userInput = "banana";
	      firstLetter = 'g';

	     // System.out.println(userInput.charAt(0));
	     // System.out.println(userInput.charAt(1));
	      //System.out.println(userInput.charAt(2));
	      
	      
	      
	      if ((userInput.charAt(0)) == firstLetter) {
	    
	       System.out.println("Found match: " + firstLetter);
	      }
	      else {
	         System.out.println("No match: " + firstLetter);
	      } 
	      System.out.println("this is first letter of word:" + userInput.charAt(0));
	      return;
	   }
	}

