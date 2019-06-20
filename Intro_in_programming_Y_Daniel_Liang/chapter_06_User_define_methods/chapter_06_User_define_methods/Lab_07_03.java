package chapter_06_User_define_methods;
import java.util.Scanner;

public class Lab_07_03 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array = new int[100];
        int input;
        int count = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        do
        {
            input = scnr.nextInt();
            array[count] = input;
            count += 1;
        }
        while (input != 0);

        for (int i = 1; i <= 100; i++) {
            count = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == i)
                    count += 1;
            }
            if (count != 0)
                System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");
            		scnr.close();
            		} 
  
    }
    
}