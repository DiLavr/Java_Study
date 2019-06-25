/*
 * Run the program and observe the output to be: 55 4 50 19. 
 * Modify the addPlayer function to insert each number in sorted order. 
 * The new program should output: 4 19 50 55
 * - ---> The overloaded add() methods are especially useful for maintaining a list in sorted order< ------
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Array_sort_by_add {
   // Adds playerNum to end of ArrayList
   public static void addPlayer (ArrayList<Integer> players, int playerNum) {
      int i = 1;
      boolean foundHigher = false;

      // Look for first item greater than playerNum
      foundHigher = false;
      i = 1;

      while ( (!foundHigher) && (i < players.size()) ) {
         if (players.get(i) > playerNum) {
            // FIXME: insert playerNum at element i
            players.add(i, playerNum); 
        	foundHigher = true;
         }
         ++i;
      }

      // FIXME: change so executes if higher number NOT found
      if (true) { // No higher number found, add at end
        players.add(new Integer(playerNum));
      
        // It should be something here  - don't know what (((
        
      }

      return;
   }
   
   // Prints player numbers currently in ArrayList
   public static void printPlayers(ArrayList<Integer> players) {
     // int i = 1;

      for (int i = 1; i < players.size(); ++i) {
         System.out.println(" " + i + ". " + players.get(i));
      }

      return;
   }


// Maintains ArrayList of player numbers 
   public static void main (String [] args) {
      ArrayList<Integer> players = new ArrayList<Integer>();
      
      // adding 10 values 
      addPlayer(players, 55);
      addPlayer(players, 4);
      addPlayer(players, 33);
      addPlayer(players, 30);
      addPlayer(players, 40);
      addPlayer(players, 80);
      addPlayer(players, 70);
      addPlayer(players, 18);
      addPlayer(players, -45);
      addPlayer(players, -100);
      
      printPlayers(players);

      return;
   }
}
