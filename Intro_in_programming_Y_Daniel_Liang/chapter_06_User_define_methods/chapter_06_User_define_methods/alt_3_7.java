package chapter_06_User_define_methods;

public class alt_3_7 {

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 5, 4, 3, 23, 43, 2, 0};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                  count++;
            }
            System.out.println(arr[i] + "\toccures\t" + count + " times");
        }
    }
}