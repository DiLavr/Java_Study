import java.util.ArrayList;
import java.util.Scanner;

public class SeatReservation {
   /*** Methods for ArrayList of Seat objects ***/
   public static void makeSeatsEmpty(ArrayList<Seat> seats) {
      int i = 0;
      for (i = 0; i < seats.size(); ++i) {
         seats.get(i).makeEmpty();
      }
      return;
   }

   public static void printSeats(ArrayList<Seat> seats) {
      int i = 0;
      for (i = 1; i < seats.size(); ++i) {
         System.out.print(i + ": ");
         seats.get(i).print();
      }
      return;
   }

   public static void addSeats(ArrayList<Seat> seats, int numSeats) {
      int i = 0;
      for (i = 0; i < numSeats; ++i) {
         seats.add(new Seat());
      }
      return;
   }
   /*** End methods for ArrayList of Seat objects ***/

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String usrInput = "";
      String firstName, lastName;
      int amountPaid = 0;
      int seatNumber = 0;
      Seat newSeat;
      ArrayList<Seat> allSeats = new ArrayList<Seat>();

      // Add 5 seat objects to ArrayList
      addSeats(allSeats, 6);

      // Make all seats empty
      makeSeatsEmpty(allSeats);

      while (!usrInput.equals("q")) {

         System.out.println();
         System.out.print("Enter command (P - print /R - reserve/D - delete reserve/ Q - quit the menu): ");
         usrInput = scnr.next();

         if (usrInput.equals("p")) { // Print seats
            printSeats(allSeats);
         }
         else if (usrInput.equals("r")) { // Reserve seat
            System.out.print("Enter seat num: ");
            seatNumber = scnr.nextInt();

            if ( !(allSeats.get(seatNumber).isEmpty()) ) {
               System.out.println("Seat not empty.");
            }
            else {
               System.out.print("Enter first name: ");
               firstName = scnr.next();
               System.out.print("Enter last name: ");
               lastName = scnr.next();
               System.out.print("Enter amount paid: ");
               amountPaid = scnr.nextInt();

               newSeat = new Seat(); // Create new Seat object
               newSeat.reserve(firstName, lastName, amountPaid); // Set fields
               allSeats.set(seatNumber, newSeat); // Add new object to ArrayList

               System.out.println("Completed.");
            }
         }
         // FIXME: Add option to delete reservations
         else if (usrInput.equals("d")) { //Delete reserve
        	 System.out.println("Here is the list of reserves:");
        	 printSeats(allSeats);
        	 System.out.print("Enter seat num you want to delete from reserve: ");
             seatNumber = scnr.nextInt();
             allSeats.get(seatNumber).makeEmpty();
             
             System.out.println("Completed.");
         }
             
         
         else if (usrInput.equals("q")) { // Quit
            System.out.println("Quitting.");
         }
         else {
            System.out.println("Invalid command.");
         }
      }

      return;
   }
}