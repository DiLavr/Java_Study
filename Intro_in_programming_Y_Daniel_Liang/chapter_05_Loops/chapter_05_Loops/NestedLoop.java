package chapter_05_Loops;

/*
 * Print numbers 0, 1, 2, ..., userNum as shown, with each number indented by that 
 * number of spaces. For each printed line, print the leading spaces, then the number, 
 * and then a newline. Hint: Use i and j as loop variables (initialize i and j explicitly). 
 * Note: Avoid any other spaces like spaces after the printed number. Ex: userNum = 3 prints:
0
 1
  2
   3
 * 
 */
public class NestedLoop {
	public static void main(String[] args) {
		int userNum = 3;
		int i = 0;
		int j = 0;

		for (i = 0; i <= userNum; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}

		return;
	}
}
