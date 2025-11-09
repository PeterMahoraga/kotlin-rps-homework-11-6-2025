public class P51_ObjectArrayExample {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].setCar(1000 + i);
        }
        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}