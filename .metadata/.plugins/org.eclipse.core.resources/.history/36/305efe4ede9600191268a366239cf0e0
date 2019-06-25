package chapter_07_Arrays;
import java.util.Scanner;
public class example_7_21_sum {

	


	public static void main(String args[])
    {
       
        Scanner input = new Scanner(System.in);
    

        System.out.println("Enter numbers, 0 when want to finish");
        // initialize the variables
        
        int n = input.nextInt();
        int countP = 0;
        int countN = 0;
        int count = 0;
        int sum = n;
        float average = (float) sum / 2;

        while (n != 0)
        {
            n = input.nextInt();
        count++;

        if(n >= 0)
            countP++;
        if (n < 0)
            countN++;
        }
        System.out.println("Total positive " + countP);
        System.out.println("Total negative " + countN);
        System.out.println("Total numbers " + count);
        System.out.println("Total average " + average);
    }
}