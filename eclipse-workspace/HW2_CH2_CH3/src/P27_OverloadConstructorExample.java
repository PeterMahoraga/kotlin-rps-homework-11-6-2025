public class P27_OverloadConstructorExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.show();
        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}