import java.lang.reflect.Array;

public class P39_ArrayNewInstanceExample {
    public static void main(String[] args) {
        int[] test = (int[]) Array.newInstance(int.class, 3);
        Array.setInt(test, 0, 10);
        Array.setInt(test, 1, 20);
        Array.setInt(test, 2, 30);
        System.out.println("test[0] = " + Array.getInt(test, 0));
    }
}
// Expected: test[0] = 10