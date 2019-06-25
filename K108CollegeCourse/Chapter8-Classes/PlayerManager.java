/* ======Using ArrayList member methods: A player jersey numbers program==========
 * Result:
 * Commands: 'a' add, 'd' delete,'p' print, 'q' quit: 
Command: p
Command: a
 Player number: 27
Command: a
 Player number: 44
Command: a
 Player number: 9
Command: p
 27
 44
 9
Command: d
 Player number: 9
Command: p
 27
 44
Command: q
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
   // Adds playerNum to end of ArrayList
   public static void addPlayer (ArrayList<Integer> players, int playerNum) {
      players.add(new Integer(playerNum));

      return;
   }

   // Deletes playerNum from ArrayList
   public static void deletePlayer (ArrayList<Integer> players, int playerNum) {
      int i = 0;
      boolean found = false;

      // Search for playerNum in vector
      found = false;
      i = 0;

      while ( (!found) && (i < players.size()) ) {
         if (players.get(i).equals(playerNum)) {
            players.remove(i); // Remove
            found = true; 
         }

         ++i;
      }

      return;
   }
   
   // Prints player numbers currently in ArrayList
   public static void printPlayers(ArrayList<Integer> players) {
      int i = 0;

      for (i = 0; i < players.size(); ++i) {
         System.out.println(" " + players.get(i));
      }

      return;
   }

   // Maintains ArrayList of player numbers 
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> players = new ArrayList<Integer>();
      String userInput = "-";
      int playerNum = 0;

      System.out.println("Commands: 'a' add, 'd' delete,");
      System.out.println("'p' print, 'q' quit: ");

      while (!userInput.equals("q")) {
         System.out.print("Command: ");
         userInput = scnr.next();

         if (userInput.equals("a")) {
            System.out.print(" Player number: ");
            playerNum = scnr.nextInt();

            addPlayer(players, playerNum);
         }
         if (userInput.equals("d")) {
            System.out.print(" Player number: ");
            playerNum = scnr.nextInt();

            deletePlayer(players, playerNum);
         }
         else if (userInput.equals("p")) {
            printPlayers(players);
         }
      }

      return;
   }
}