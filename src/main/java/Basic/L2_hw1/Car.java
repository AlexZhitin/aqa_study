package Basic.L2_hw1;

public class Car {
    private int age;
    private String color;

    public Car() {
    }

    public Car(int age) {
        this.age = age;
    }

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Age:" + age + " Color:" + color;
    }
}
