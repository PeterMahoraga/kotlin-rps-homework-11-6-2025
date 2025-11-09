public class Car {
    private int num = 0;  // Private (P20/P22)
    private double gas = 0.0;  // Private with validation

    // Static for P31
    private static int counter = 0;

    // Default constructor (P26/P27/P28)
    public Car() {
        this(0, 0.0);  // this() call
        counter++;
    }

    // Overload constructor (P27)
    public Car(int n, double g) {
        num = n;
        gas = g;
        counter++;
    }

    // Single param methods (P9/P14)
    public void setNum(int n) {
        num = n;
    }

    public void setGas(double g) {
        if (g >= 0 && g <= 100) {  // Validation (P22)
            gas = g;
        }
    }

    // Multi param (P11/P15)
    public void setNumGas(int n, double g) {
        num = n;
        gas = g;
        show();  // Inner call (P12)
    }

    // Show (P12/P22/P26)
    public void show() {
        System.out.println("車號是 " + num + " , 汽油量是 " + gas);
    }

    // Get/Return (P16/P17)
    public int getNum() {
        return num;
    }

    public double getGas() {
        return gas;
    }

    // Overload setCar (P24)
    public void setCar(int n) {
        num = n;
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
    }

    // Static (P31)
    public static int getCounter() {
        return counter;
    }
}
public class P5_ObjectCreateExample {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
    }
}
// No output (basic creation)