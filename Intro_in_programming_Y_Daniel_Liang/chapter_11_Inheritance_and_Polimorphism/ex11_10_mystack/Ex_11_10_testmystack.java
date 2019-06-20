package ex11_10_mystack;

import java.util.Scanner;

public class Ex_11_10_testmystack {

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        //loading stack
        System.out.print("Please Enter 5 strings: ");
        for (int i = 0; i < 5; i++) stack.push(input.next());
        
        input.close();

        System.out.println("Reverse order.");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}