public class P17_GetMethodExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setNum(1234);
        car1.setGas(20.5);
        int number = car1.getNum();
        double gasoline = car1.getGas();
        System.out.println("number = " + number);
        System.out.println("gasoline = " + gasoline);
    }
}
// number = 1234 \n gasoline = 20.5