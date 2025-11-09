import java.util.Scanner;

public class P14_SwitchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("輸入是 1");
                break;
            case 2:
                System.out.println("輸入是 2");
                break;
            default:
                System.out.println("其他");
                break;
        }
        input.close();
    }
}
// Expected (input 1): 輸入是 1