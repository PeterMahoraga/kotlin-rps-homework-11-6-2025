public class P34_ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println("i = " + i);
        }
    }
}
// Expected: i = 1 \n i = 2 \n i = 4 \n i = 5