/**
 * The program prints manager and staff data using the EmployeeManager's and EmployeeStaff's printInfo methods.
 * the EmployeeManager and EmployeeStaff getAnnualBonus methods to return the correct bonus rather than just returning 0.
 *  A manager's bonus is 10% of the annual salary and a staff's bonus is 7.5% of the annual salary.
 */

package Company;

public class EmployeeMain {

	public static void main(String[] args) {

		// Create the objects
		EmployeeManager manager = new EmployeeManager(25);
		EmployeeStaff staff1 = new EmployeeStaff("Michele");

		// Load data into the objects using the Person class's method
		manager.setData("Michele", "Sales", "03-03-1975", 70000);
		staff1.setData("Bob", "Sales", "02-02-1980", 50000);

		// Print the objects
		manager.printInfo();
		System.out.println("Annual bonus: " + manager.getAnnualBonus());
		staff1.printInfo();
		System.out.println("Annual bonus: " + staff1.getAnnualBonus());

		return;
	}
}
