import java.util.Scanner;

public class P16_SwitchCharExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.next();
        char ch = str.charAt(0);
        switch (ch) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            default:
                System.out.println("其他");
        }
        input.close();
    }
}
// Expected (input Apple): A