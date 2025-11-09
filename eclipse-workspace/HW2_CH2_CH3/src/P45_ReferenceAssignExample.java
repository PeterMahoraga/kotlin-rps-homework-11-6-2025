public class P45_ReferenceAssignExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setNum(1234);
        Car car2 = car1;
        car2.setNum(5678);
        car1.show();
    }
}