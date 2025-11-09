public class P41_ArrayInitExample {
    public static void main(String[] args) {
        int[] num = {10, 20, 30};
        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }
    }
}
// Expected: num[0] = 10 \n ... num[2] = 30