import java.util.Scanner;

public class P10_IfElseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        if (num == 1) {
            System.out.println("輸入是 1");
        } else {
            System.out.println("輸入不是 1");
        }
        input.close();
    }
}
// Expected (input 2): 輸入不是 1