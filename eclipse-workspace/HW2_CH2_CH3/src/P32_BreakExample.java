public class P32_BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println("i = " + i);
        }
    }
}
// Expected: i = 1 \n i = 2