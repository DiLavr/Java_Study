package assignment1;

	import java.util.ArrayList;
	public class Lavruk_19_03 {
	    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
	        ArrayList<E> newList = new ArrayList<>(list.size());
	        for (E aList : list) {
	            if (!newList.contains(aList)) {
	                newList.add(aList);
	            }
	        }
	        return newList;
	    }
	}
	

