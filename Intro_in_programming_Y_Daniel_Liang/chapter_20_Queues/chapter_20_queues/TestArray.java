package chapter_20_queues;
/**
 * The critical difference between them pertains to internal
implementation, which affects their performance. ArrayList is efficient for 
retrieving elements and LinkedList is efficient for inserting and removing elements at the beginning of
the list. Both have the same performance for inserting and removing elements in the middle
or at the end of the list. 
 */
import java.util.*;

public class TestArray {
  public static void main(String[] args) {
	
    List<String> list1 = Arrays.asList("red", "green", "blue");
    List<String> list2 = Arrays.asList("red", "green", "blue");
    //List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
    
    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);

 list1.removeAll(list2);
 System.out.println(list1);
    
  }
}     