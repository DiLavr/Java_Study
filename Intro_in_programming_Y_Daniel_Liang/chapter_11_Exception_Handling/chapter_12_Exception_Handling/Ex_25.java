package chapter_12_Exception_Handling;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_25 {

     static final int assistant = 0;
     static final int associate = 1; 
     static final int full = 2;
    private static double getAverage(long total, int size) {
        return (double)total / size;
    }
    private static double getTotal(Object[] objects) {
        double total = 0;
        for (Object o : objects) {
            total += (double)o;
        }
        return total;
    }
    private static int getInternalSize(ArrayList<ArrayList<Double>> lists) {
        int size = 0;
        for (ArrayList<Double> list : lists) {
            size += list.size();
        }
        return size;
    }
    
    public static void main(String[] args) throws Exception {
        ArrayList<ArrayList<Double>> allRanks = new ArrayList<>(3);
        allRanks.add(assistant, new ArrayList<>());
        allRanks.add(associate, new ArrayList<>());
        allRanks.add(full, new ArrayList<>());

        URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
        Scanner input = new Scanner(url.openStream());
        while (input.hasNext()) {
            input.next();
            input.next();
            String rank = input.next();
            if (rank.contains("assistant")) {
                allRanks.get(assistant).add(input.nextDouble());
            } else if (rank.contains("associate")) {
                allRanks.get(associate).add(input.nextDouble());
            } else {
                allRanks.get(full).add(input.nextDouble());
            }
        }
        int assiTotal = (int)getTotal(allRanks.get(assistant).toArray());
        int assoTotal = (int)getTotal(allRanks.get(associate).toArray());
        int fullTotal = (int)getTotal(allRanks.get(full).toArray());
        int total = assiTotal + assoTotal + fullTotal;
        System.out.println("Total salary for assistant professors: $" + assiTotal);
        System.out.printf("Assistant average: $%.2f \n", getAverage(assiTotal, allRanks.get(assistant).size()));
        System.out.println("Total salary for associate professors: $" + assoTotal);
        System.out.printf("Associate average: $%.2f \n", getAverage(assoTotal, allRanks.get(associate).size()));
        System.out.println("Total salary for full professors: $" + fullTotal);
        System.out.printf("Full average: $%.2f \n", getAverage(fullTotal, allRanks.get(full).size()));
        System.out.println("College Total salary: $" + total);     
        System.out.printf("Average salary at college: $%.2f \n", getAverage(total, getInternalSize(allRanks)));
    }
}