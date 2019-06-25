package chapter_20_queues;
/**
 * The critical difference between them pertains to internal
implementation, which affects their performance. ArrayList is efficient for 
retrieving elements and LinkedList is efficient for inserting and removing elements at the beginning of
the list. Both have the same performance for inserting and removing elements in the middle
or at the end of the list. 
 */
import java.util.*;

public class TestArrayAndLinkedList2 {
  public static void main(String[] args) {
	  List<Integer> arrayList = Arrays.asList(10, 20, 30, 40, 50); //Java provides the static asList method for creating a list from a variable-length list of
	  //arguments. Thus you can use the following code to create a list of strings and a list of 	  integers:

    System.out.println("A list of integers in the array list:");
    System.out.println(arrayList);

    LinkedList<Object> linkedList = new LinkedList<>(arrayList);
    linkedList.add(1, "red");
    linkedList.removeLast();
    linkedList.addFirst("green");

    System.out.println("Display the linked list backward:"); 
    ListIterator<Object> listIterator = linkedList.listIterator();
    while (listIterator.hasNext()) {
      System.out.print(listIterator.next() + " ");
    }
    System.out.println();
  
    System.out.println("Display the linked list backward:");
    listIterator = linkedList.listIterator(linkedList.size());
    while (listIterator.hasPrevious()) {
      System.out.print(listIterator.previous() + " ");
    }
  }
}     