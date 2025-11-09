public class P38_StringIndexOfExample {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        int num = str1.indexOf('a');
        if (num != -1) {
            System.out.println("'a' 的位置: " + num);
        } else {
            System.out.println("找不到 'a'");
        }
    }
}
// 'a' 的位置: 1