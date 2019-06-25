package employees_overriding_class_method;


public class EmployeeStaff extends EmployeePerson {

   private String managerName;

   // ***********************************************************************

   // Default constructor
   public EmployeeStaff() {
      managerName = "";
   } 

   // ***********************************************************************

   // Constructor with parameters 
   public EmployeeStaff(String reportsTo) {
      managerName = reportsTo;
   } 

   // ***********************************************************************

   // Get the name of the manager
   public String getManagerName() {
      return managerName;
   } 

   // ***********************************************************************

   @Override
   public void printInfo() {
//      System.out.print("Name: " + fullName + ", Department: " + 
//                       departmentCode + ", Birthday: " + birthday +
//                       ", Salary: " + annualSalary);
	   super.printInfo();
      System.out.println(", Manager: " + getManagerName());
   } 
}

