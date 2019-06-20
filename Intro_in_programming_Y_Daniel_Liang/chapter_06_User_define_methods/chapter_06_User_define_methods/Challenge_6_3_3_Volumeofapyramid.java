package chapter_06_User_define_methods;
/*
 * Define a method pyramidVolume with double parameters baseLength, baseWidth, and pyramidHeight, 
 * that returns as a double the volume of a pyramid with a rectangular base. Relevant geometry equations: 
Volume = base area x height x 1/3 
Base area = base length x base width. 
(Watch out for integer division). 
 * 
 */

public class Challenge_6_3_3_Volumeofapyramid {

	public static void main (String [] args) {
	      System.out.println("Volume for 1.0, 1.0, 1.0 is: " + pyramidVolume(1.0, 1.0, 1.0));
	      return;
	   }
	
	public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {
		
		double baseArea =  baseLength * baseWidth;
		double volume = baseArea * pyramidHeight / 3;
		
		 return volume;
	}
		
			
	}
	

