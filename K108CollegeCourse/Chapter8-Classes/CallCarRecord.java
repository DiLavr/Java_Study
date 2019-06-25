//------------> Define a constructor
/* Task:
 * Define a constructor as indicated. Sample output for below program:
Year: 0, VIN: -1
Year: 2009, VIN: 444555666
 * 
 */

// ===== Look at class CarRecord =====

public class CallCarRecord {
   public static void main (String [] args) {
      CarRecord familyCar = new CarRecord();

      familyCar.print();
      familyCar.setYearMade(2009);
      familyCar.setVehicleIdNum(444555666);
      familyCar.print();

      return;
   }
}


