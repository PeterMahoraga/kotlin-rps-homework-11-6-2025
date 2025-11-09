import java.util.Scanner;

public class P19_LogicalOpExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter char: ");
        char ch = input.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            System.out.println("是");
        } else if (ch == 'N' || ch == 'n') {
            System.out.println("否");
        } else {
            System.out.println("其他");
        }
        input.close();
    }
}
// Expected (input y): 是