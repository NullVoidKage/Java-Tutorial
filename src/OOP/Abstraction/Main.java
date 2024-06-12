package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 3);

        circle.displayInfo();
        System.out.println("Circle Area " + circle.calculateArea());

        rectangle.displayInfo();
        System.out.println("Rectangle Area " + rectangle.calculateArea());
    }
}
