public class P31_StaticExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("物件數: " + Car.getCounter());
    }
}