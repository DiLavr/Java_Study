// ===== Code from file PhonePlan.java =====
public class PhonePlan {
   private int freeMinutes;
   private int freeMessages;

   public PhonePlan() {
       freeMinutes  = 0;
       freeMessages = 0;
    }


    // FIXME: Create a second constructor with numMinutes and numMessages parameters.

    public PhonePlan(int numMinutes, int numMessages) {
       freeMinutes = numMinutes;
       freeMessages = numMessages;
    }
  
  
   /* Your solution goes here  */

   public void print() {
      System.out.println("Minutes: " + freeMinutes + ", Messages: " + freeMessages);
      return;
   }
}
// ===== end =====