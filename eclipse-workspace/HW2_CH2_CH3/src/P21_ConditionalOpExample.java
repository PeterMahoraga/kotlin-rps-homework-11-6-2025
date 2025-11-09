import java.util.Scanner;

public class P21_ConditionalOpExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        String result = (num == 1) ? "是 1" : "不是 1";
        System.out.println(result);
        input.close();
    }
}
// Expected (input 1): 是 1