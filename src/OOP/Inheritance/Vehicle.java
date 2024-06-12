package OOP.Inheritance;

public class Vehicle {
    private String vehicleBrand;

    public Vehicle(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public void startEngine() {
        System.out.println("Starting Engine!!!");
    }

    public void stopEngine() {
        System.out.println("Stopping Engine!!!");
    }

    public void displayInfo() {
        System.out.println("Vehicle Brand: " + vehicleBrand);
    }
}
