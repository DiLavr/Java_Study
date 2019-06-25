package chapter_20_queues;
/**
 * Iterator is a classic design pattern for walking through a data structure without having to
expose the details of how data is stored in the data structure.
The Collection interface extends the Iterable interface. The Iterable interface
defines the iterator method, which returns an iterator. The Iterator interface provides a
uniform way for traversing elements in various types of collections. The iterator() method
in the Iterable interface returns an instance of Iterator, as shown in Figure 20.2, which
provides sequential access to the elements in the collection using the next() method. You
can also use the hasNext() method to check whether there are more elements in the iterator,
and the remove() method to remove the last element returned by the iterator.
 * 
 */

import java.util.*;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>(); // creates a concrete collection object using ArrayList
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

//    Iterator<String> iterator = collection.iterator();
//    while (iterator.hasNext()) {
//      System.out.print(iterator.next().toUpperCase() + " ");
//    }
// the result for these will be the same as with while    
    for (String element: collection)
    	System.out.print(element.toUpperCase() + " ");
    
    System.out.println();
  }
}