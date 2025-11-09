import java.util.Scanner;

public class P8_IfErrorExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");  // Added prompt
        int num = input.nextInt();  // e.g., input 1
        if (num == 1)
            System.out.println("正確");  // Only this if input 1—no {} bug
        System.out.println("總是執行");  // Always runs—shows logic error
        input.close();
    }
}
// Expected (input 1):  
// Enter number: 1  
// 正確  
// 總是執行  
// (Input 2: Only "總是執行"—demo no {} affects only one line)1