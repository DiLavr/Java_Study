/*
The below program utilizes several methods and an ArrayList of custom Seat objects
 to allow the user to reserve seats or print the seating arrangements.
 * ============> A seat reservation system involving a class, ArrayLists, and methods.
 */

public class Seat {
   private String firstName;
   private String lastName;
   private int amountPaid;

   // Method to initialize Seat fields
   public void reserve(String resFirstName, String resLastName, int resAmountPaid) {
      firstName = resFirstName;
      lastName = resLastName;
      amountPaid = resAmountPaid;
      return;
   }

   // Method to empty a Seat
   public void makeEmpty() {
      firstName = "empty";
      lastName = "empty";
      amountPaid = 0;
      return;
   }

   // Method to check if Seat is empty
   public boolean isEmpty() {
      return (firstName.equals("empty"));
   }

   // Method to print Seat fields
   public void print() {
      System.out.print(firstName + " ");
      System.out.print(lastName + " ");
      System.out.println("Paid: " + amountPaid);
      return;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public int getAmountPaid() {
      return amountPaid;
   }
}