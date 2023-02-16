package Basic.L3_hw4.vehicles;

public class Car extends Vehicle {

    public Car(int doors, String color) {
        super.doors = doors;
        super.color = color;
    }

    public void honk() {
        System.out.println("бип-бип");
    }
}