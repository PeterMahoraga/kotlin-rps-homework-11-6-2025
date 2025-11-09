public class P49_MultiDimOutputExample {
    public static void main(String[] args) {
        int[][] a = {{80, 60, 22, 50, 75}, {90, 55, 68, 72, 58}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multi-dim output done.");
    }
}
// Expected: Same as P47 + Multi-dim output done.