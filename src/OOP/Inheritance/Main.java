package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.startEngine();
        car.horn();
        car.stopEngine();
        car.displayInfo();

        Bicycle bicycle = new Bicycle("Trek", 18);
        bicycle.startEngine();
        bicycle.ringBell();
        bicycle.stopEngine();
        bicycle.displayInfo();
    }
}
