package assignment1;

public class Lavruk_18_04 {

		public static double sumSeries(double m ) {
		if (m==1)
			return 1;
		else if (m==0||m==-1)
			return -1;
		else 
			return (1/m) + sumSeries(m-1);
		
	}

}
