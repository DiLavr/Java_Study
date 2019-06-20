package chapter_09_Objects_and_Classes;
public class SimpleStock {
	String Symbol;
	String Name;
	double previousClosingPrice;
	double currentPrice;

	  /** Construct a Stock with the default values */
	SimpleStock() {
		Symbol = "symbol";
		Name = "name";
			  }

	  /** Construct a Stock with a specified Symbols and Names */
	SimpleStock(String newsymbol, String newname, double newpreviousClosingPrice, double newcurrentPrice ) {
		Symbol = newsymbol;
		Name = newname;
		previousClosingPrice = newpreviousClosingPrice;
		currentPrice = newcurrentPrice;
	    	  }

	  /** Return the getChangePercent of this Stock */
	  double getChangePercent() {
	    return 100 - (currentPrice * 100 / previousClosingPrice);
	  }

}

