package chapter_20_queues;
import java.util.*;
public class TestIterator_rus {
public static void main(String [] args) {
	ArrayList<String> states = new ArrayList<String>();
	states.add("German");
	 states.add("France");
     states.add("Italy");
     states.add("Spain");
     
     ListIterator<String> listIter = states.listIterator();
     
    	while(listIter.hasNext()) {
    		System.out.println(listIter.next());
    	}
    	  // �?ейча�? текущий �?лемент - И�?пани�?
        // изменим значение �?того �?лемента
        listIter.set("Португали�?");
        // пройдем�?�? по �?лементам в обратном пор�?дке
        while(listIter.hasPrevious()){
         
            System.out.println(listIter.previous());
        } 
    	 
    	 
     }
		
     }
