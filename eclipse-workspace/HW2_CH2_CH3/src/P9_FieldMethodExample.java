public class P9_FieldMethodExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setNum(1234);
        car1.setGas(20.5);
        System.out.println("車號是 " + car1.num);
        System.out.println("汽油量是 " + car1.gas);
    }
}
// 車號是 1234 \n 汽油量是 20.5