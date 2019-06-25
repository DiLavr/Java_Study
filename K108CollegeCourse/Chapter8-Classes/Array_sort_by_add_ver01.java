import java.util.ArrayList;
import java.util.Scanner;

public class Array_sort_by_add_ver01 {
	public static void addPlayer (ArrayList<Integer> players, int playerNum) {
	    int index = 0;

	    for (int i = 0; i< players.size(); i++) {
	        if (players.get(i).compareTo(playerNum) >= 0) {
	            index = i;
	            break;
	        } else {
	            index = i +1;
	        }
	    }
	    players.add(index, playerNum);
	}
	
	// Prints player numbers currently in ArrayList
	public static void printPlayers(ArrayList<Integer> players) {
	    for (int i = 0; i < players.size(); i++) {
	        System.out.println(" " + (i+1) + ". " + players.get(i));
	    }
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
	  addPlayer(players, 19);
	  addPlayer(players, -45);
	  addPlayer(players, -100);

	  printPlayers(players);

	  return;
	}
	
}
