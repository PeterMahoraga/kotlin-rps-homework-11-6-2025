
public class P30_NestedLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
// Expected: i=1, j=1 \n ... i=3, j=2