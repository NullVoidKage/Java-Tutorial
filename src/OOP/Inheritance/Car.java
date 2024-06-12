package OOP.Inheritance;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleBrand, int numberOfDoors) {
        super(vehicleBrand);
        this.numberOfDoors = numberOfDoors;
    }

    public void horn() {
        System.out.println("HORN HORN");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: "+ numberOfDoors);
    }
}
