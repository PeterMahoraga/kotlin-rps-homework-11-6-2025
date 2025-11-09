import java.util.Scanner;
public class P43_MathMaxExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("輸入 num1: ");
        int num1 = input.nextInt();
        System.out.print("輸入 num2: ");
        int num2 = input.nextInt();
        int ans = Math.max(num1, num2);
        System.out.println("最大值: " + ans);
        input.close();
    }
}
// (10 20): 最大值: 20