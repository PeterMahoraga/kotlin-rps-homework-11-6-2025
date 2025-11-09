import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P45_ArraysSortExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] a = new Integer[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        input.close();
    }
}
// Expected (input 5 3 1 4 2): 5 4 3 2 1 