/**
 * The following program allows a user to add new employees to an ArrayList and
 * print employee information in sorted order. The Employee class implements
 * Comparable<EmployeeData> and overrides the compareTo() method in order to
 * enable the use of the Collections class's sort() method.
 * 
 * @author Cosmopus
 *
 *         a Michael Faraday 124 1 a Ada Lovelace 203 2 a James Maxwell 123 1 a
 *         Alan Turing 201 2 p q
 * 
 */

public class EmployeeData implements Comparable<EmployeeData> {
	private String firstName; // First Name
	private String lastName; // Last Name
	private Integer emplID; // Employee ID
	private Integer deptNum; // Department Number

	EmployeeData(String firstName, String lastName, Integer emplID, Integer deptNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emplID = emplID;
		this.deptNum = deptNum;
	}

	@Override
	public int compareTo(EmployeeData otherEmpl) {
		int comparisonVal = 0; // Outcome of comparison

		// Compare based on department number first
		comparisonVal = deptNum.compareTo(otherEmpl.deptNum);

		// If in same department, compare by EmpID
		if (comparisonVal == 0) {
			comparisonVal = emplID.compareTo(otherEmpl.emplID);
		}
		return comparisonVal;
	}

	@Override
	public String toString() {
		return "ID: " + emplID + "\t\t" + lastName + " " + firstName + "\t\tDept. #: " + deptNum;
	}
}