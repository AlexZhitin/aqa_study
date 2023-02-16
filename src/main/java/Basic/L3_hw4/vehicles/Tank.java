package Basic.L3_hw4.vehicles;

public class Tank extends Vehicle {

    public Tank(String color) {
        super.color = color;
    }

    public Tank(int doors, String color) {
        super.doors = doors;
        super.color = color;
    }

    public Tank(int doors, int weight) {
        super.doors = doors;
        super.weight = weight;
    }

    public void honk() {
        System.out.println("бабах москаля");
    }

}