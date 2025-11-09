public class P7_MultipleObjectExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;
        Car car2 = new Car();
        car2.num = 5678;
        car2.gas = 30.0;
        System.out.println("car1 車號是 " + car1.num + ", 汽油量是 " + car1.gas);
        System.out.println("car2 車號是 " + car2.num + ", 汽油量是 " + car2.gas);
    }
}