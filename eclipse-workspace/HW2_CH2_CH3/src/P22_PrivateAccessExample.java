public class P22_PrivateAccessExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setNum(1234);
        car1.setGas(20.5);
        car1.setGas(-10.0);
        car1.show();
    }
}