public class P47_MultiDimArrayExample {
    public static void main(String[] args) {
        int[][] a = {{80, 60, 22, 50, 75}, {90, 55, 68, 72, 58}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Expected: 80 60 22 50 75  
// 90 55 68 72 58 