public class P40_StringBufferExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = " Programming";
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);
        System.out.println("結果: " + sb.toString());
    }
}
// 結果: Java Programming