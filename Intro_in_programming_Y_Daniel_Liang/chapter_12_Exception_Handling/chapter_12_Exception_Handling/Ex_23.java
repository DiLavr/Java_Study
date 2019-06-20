
package chapter_12_Exception_Handling;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_23 {
	private static double getAverage(ArrayList<Integer> scores) {
        double total = getTotal(scores);
        return total / scores.size();
    }
	private static int getTotal(ArrayList<Integer> scores) {

        int total = 0;
        for (int score : scores) {
            total += score;
        }

        return total;
    }
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            while (input.hasNextInt()) {
                scores.add(input.nextInt());
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        
        System.out.println("Array in the file (Scores) = \n" + scores + "\nTotal = " + getTotal(scores) + "\nAverage = " +getAverage(scores) );
        
    }
}
