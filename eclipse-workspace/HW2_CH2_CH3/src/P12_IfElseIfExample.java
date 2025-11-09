import java.util.Scanner;

public class P12_IfElseIfExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        if (num == 1) {
            System.out.println("輸入是 1");
        } else if (num == 2) {
            System.out.println("輸入是 2");
        } else {
            System.out.println("其他");
        }
        input.close();
    }
}
// Expected (input 3): 其他