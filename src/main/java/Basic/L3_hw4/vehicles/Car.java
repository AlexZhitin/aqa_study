package Basic.L3_hw4.vehicles;

public class Car extends Vehicle {

    public Car(int doors, String color) {
        this.doors = doors;
        this.color = color;
        super.weight = getWeight();
    }

    public void honk() {
        System.out.println("бип-бип");
    }
}