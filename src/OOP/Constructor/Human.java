package OOP.Constructor;

public class Human {
    static final int LIFE_SPAN = 100;

    private final String name;
    private final int age;
    private float height;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
