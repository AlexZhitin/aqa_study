package Basic.L2_hw2;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.age = 5;
        this.speed = 100.5;
        this.weight = 1000;
        this.color = "black";
    }

    public Car(int age) {
        this.age = age;
        this.speed = 200.5;
        this.weight = 1500;
        this.color = "blue";
    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;
        this.weight = 999;
        this.color = "yellow";
    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = "red";
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
