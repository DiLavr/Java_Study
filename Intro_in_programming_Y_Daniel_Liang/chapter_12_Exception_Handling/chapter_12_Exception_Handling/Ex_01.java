package chapter_12_Exception_Handling;

public class Ex_01 {

	public static void main(String[] args) {
		// combine all args into one string
		String allInOne = "";
		for (String arg : args) {
			allInOne += arg;
		}
		// Split items from a string
		String[] tokens = MyString1.split(allInOne, "[+-*/]");

		// Check number of strings passed
		if (tokens.length != 3) {
			System.out.println("Usage: java Calculator \"operand1 operator operand2\"");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		try {
			// Determine the operator
			switch (tokens[1].charAt(0)) {
			case '+':
				result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
				break;
			case '-':
				result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
				break;
			case '*':
				result = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]);
				break;
			case '/':
				result = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);
			}
		} catch (NumberFormatException ex) {
			System.out.println("ERROR ");
			System.exit(0);
		}

		// THIS IS FOR THE SECOND PART OF THE EXERCISE...
		if (!isNumeric(tokens[0])) {
			System.out.println("Error \"" + tokens[0] + "\" is not numeric.");
			System.exit(0);
		}
		if (!isNumeric(tokens[2])) {
			System.out.println("Error \"" + tokens[2] + "\" is not numeric.");
			System.exit(0);
		}
		// Determine the operator
		switch (tokens[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
			break;
		case '-':
			result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
			break;
		case '*':
			result = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]);
			break;
		case '/':
			result = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);
		}

		// Display result
		System.out.println(tokens[0] + ' ' + tokens[1] + ' ' + tokens[2] + " = " + result);
	}

	public static boolean isNumeric(String s) {
		for (char ch : s.toCharArray()) {
			if (ch < '0' || ch > '9')
				return false;
		}
		return true;
	}
}
