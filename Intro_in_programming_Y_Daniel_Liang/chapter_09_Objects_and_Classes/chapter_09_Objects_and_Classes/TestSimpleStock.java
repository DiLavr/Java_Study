package chapter_09_Objects_and_Classes;

public class TestSimpleStock {
	/** Main method */
	  public static void main(String[] args) {
	    
		 		  
		    // Create a Stock with values
	    SimpleStock Stock1 = new SimpleStock("ORCL" , "Oracle Corporation", 34.5 , 34.35 );
	    System.out.print("Symbol: " + Stock1.Symbol +"\t Name: " + Stock1.Name + "\n PreviousClosingPrice: "
	    + Stock1.previousClosingPrice + "\n CurrentPrice: " + Stock1.currentPrice + "\n The price-change percentage: ");
	    System.out.print(String.format("%.2f", Stock1.getChangePercent()) +" %");
	
	  }
}

