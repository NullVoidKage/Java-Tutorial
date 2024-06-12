package OOP.Inheritance;

public class Bicycle extends Vehicle{
    private int numberOfGears;
    public Bicycle(String vehicleBrand, int numberOfGears) {
        super(vehicleBrand);
        this.numberOfGears = numberOfGears;
    }

    public void ringBell() {
        System.out.println("Ring ring!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of gears: "+ numberOfGears);
    }

}
