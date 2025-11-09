import java.util.Scanner;

public class P15_SwitchErrorExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("1");
                // No break—falls to case 2
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("其他");
        }
        input.close();
    }
}
// Expected (input 1): 1 \n 2 (bug demo)