package execises;

public class Test_split_o {
	 public static void main(String[] args) {
		  String[] tokens = "Welcome to Java".split("o");
		  for (int i = 0; i < tokens.length; i++) {
		   System.out.print(tokens[i] + " ");
		  }
		 }
}