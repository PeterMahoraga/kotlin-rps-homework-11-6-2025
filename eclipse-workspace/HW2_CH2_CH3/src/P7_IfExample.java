import java.util.Scanner;

public class P7_IfExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");  // Added prompt
        int num = input.nextInt();
        if (num == 1) {
            System.out.println("輸入是 1");  // Matches slide P7
        }
        input.close();
    }
}
// Expected (type 1 + Enter):  
// Enter number: 1  
// 輸入是 1