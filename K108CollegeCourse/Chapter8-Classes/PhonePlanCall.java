// ----------> Overload constractor 

/*
 * Write a second constructor as indicated. Sample output:
User1: Minutes: 0, Messages: 0
User2: Minutes: 1000, Messages: 5000
 * 
 */

// ===== Code from file CallPhonePlan.java =====
public class PhonePlanCall {
   public static void main (String [] args) {
      PhonePlan user1Plan = new PhonePlan(); // Calls default constructor
      PhonePlan user2Plan = new PhonePlan(1000, 5000); // Calls newly-created constructor

      System.out.print("User1: ");
      user1Plan.print();

      System.out.print("User2: ");
      user2Plan.print();

      return;
   }
}
// ===== end =====