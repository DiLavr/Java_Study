
public class play_test {
	public static void main (String [] args) {
		
		double myFloat = 12.34;
		
		System.out.printf("Value: %7.2f", myFloat); // Value:   12.34
		System.out.printf("\nValue: %.4f", myFloat); // Value: 12,3400
		System.out.printf("\nValue: %3.4e", myFloat); // Value: 1,2340e+01
		System.out.printf("\nValue: %+f", myFloat); // Value: +12,340000
		System.out.printf("\nValue: %08.2f\n", myFloat); // Value: 00012,34
		
		System.out.println();
		//----------------------------------------------------------------------
		
	      final long KM_EARTH_TO_SUN = 149598000;    // Dist from Earth to sun
	      final long KM_SATURN_TO_SUN = 1433449370;  // Dist from Saturn to sun

	      // Output distances with min number of characters
	      System.out.printf("Earth is %12d", KM_EARTH_TO_SUN);
	      System.out.printf(" kilometers from the sun.\n");
	      System.out.printf("Saturn is %11d", KM_SATURN_TO_SUN);
	      System.out.printf(" kilometers from the sun.\n");
	      System.out.println();
	      
	  // --------------output formatting for Strings---------------------
	      
	      System.out.printf("Dog age in human years (dogyears.com)\n\n");
	      System.out.printf("-------------------------\n");

	         // set num char for each column, left justified
	      System.out.printf("%-10s | %-12s\n", "Dog age", "Human age");
	      System.out.printf("-------------------------\n");

	      // set num char for each column, first col left justified
	      System.out.printf("%-10s | %12s\n", "2 months", "14 months");
	      System.out.printf("%-10s | %12s\n", "6 months", "5 years");
	      System.out.printf("%-10s | %12s\n", "8 months", "9 years");
	      System.out.printf("%-10s | %12s\n", "1 year", "15 years");
	      System.out.printf("-------------------------\n");
		System.out.println();
		
	      int myInt = 674;
	      double myDouble = 42.31;

	      System.out.printf("%05d\n", myInt); //00674
	      System.out.printf("%06.2f\n", myDouble); // 042.31
	      
	      
	      
	      
	return;	
	}
	
	
}
