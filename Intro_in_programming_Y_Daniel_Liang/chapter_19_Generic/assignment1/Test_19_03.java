package assignment1;

import java.util.ArrayList;

public class Test_19_03 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(14);
	    list.add(24);
	    list.add(14);
	    list.add(42);
	    list.add(25);
	    
	    ArrayList<Integer> newList = Lavruk_19_03.removeDuplicates(list);
	    
	    System.out.print(newList);
	}

}