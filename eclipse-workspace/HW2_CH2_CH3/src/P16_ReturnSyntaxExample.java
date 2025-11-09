class Example {
    int getValue(int x) {
        return x * 2;
    }
}
public class P16_ReturnSyntaxExample {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.getValue(5));
    }
}