package OOP.Polymorphism;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        calculator.add(1, 2  );
        System.out.println(calculator.add(1.2, 6));
    }
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
