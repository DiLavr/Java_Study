// ===== Code from file CarRecord.java =====
public class CarRecord {
   private int yearMade;
   private int vehicleIdNum;

   public void setYearMade(int originalYear) {
      yearMade = originalYear;
      return;
   }

   public void setVehicleIdNum(int vehIdNum) {
      vehicleIdNum = vehIdNum;
      return;
   }

   public void print() {
      System.out.println("Year: " + yearMade + ", VIN: " + vehicleIdNum);
      return;
   }

   // FIXME: Write constructor, initialize year to 0, vehicle ID num to -1.

   /*==== Default contstructer====*/
   
   public CarRecord() {
	   yearMade = 0;
	   vehicleIdNum = -1;
   }

}
// ===== end =====