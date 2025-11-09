public class P40_ArrayIndexErrorExample {
    public static void main(String[] args) {
        int[] test = new int[3];
        // System.out.println(test[3]); // Uncomment to crash
        System.out.println("Array length: " + test.length);
    }
}
// Expected: Array length: 3