/**
 * The following program allows a user to add new employees to an ArrayList and
 * print employee information in sorted order. The Employee class implements
 * Comparable<EmployeeData> and overrides the compareTo() method in order to
 * enable the use of the Collections class's sort() method.
 * 
 * @author Cosmopus
 *
 */

public class EmployeeData2 implements Comparable<EmployeeData2> {
	private String firstName; // First Name
	private String lastName; // Last Name
	private Integer emplID; // Employee ID
	private Integer deptNum; // Department Number

	EmployeeData2(String firstName, String lastName, Integer emplID, Integer deptNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emplID = emplID;
		this.deptNum = deptNum;
	}

	@Override
	public int compareTo(EmployeeData2 otherEmpl) {
		String fullName = ""; // Full name, this employee
		String otherFullName = ""; // Full name, comparison employee
		int comparisonVal = 0; // Outcome of comparison

		// Compare based on department number first
		comparisonVal = deptNum.compareTo(otherEmpl.deptNum);

		// If in same organization, use name
		if (comparisonVal == 0) {
			fullName = lastName + firstName;
			otherFullName = otherEmpl.lastName + otherEmpl.firstName;
			comparisonVal = fullName.compareTo(otherFullName);
		}

		return comparisonVal;
	}

	@Override
	public String toString() {
		return lastName + " " + firstName + "       \tID: " + emplID + "\t\tDept. #: " + deptNum;
	}
}