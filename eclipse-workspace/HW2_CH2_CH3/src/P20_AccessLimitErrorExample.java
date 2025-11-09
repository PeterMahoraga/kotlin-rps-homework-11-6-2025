public class P20_AccessLimitErrorExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.gas = -10.0;
        System.out.println("汽油量是 " + car1.gas);
    }
}
