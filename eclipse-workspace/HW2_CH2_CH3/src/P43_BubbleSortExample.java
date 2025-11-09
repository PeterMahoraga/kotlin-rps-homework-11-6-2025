import java.util.Scanner;

public class P43_BubbleSortExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        // Bubble sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        input.close();
    }
}
// Expected (input 5 3 1 4 2): 1 2 3 4 5 