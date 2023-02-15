package Basic.L3_hw4.vehicles;

public class Tank extends Vehicle {

    public Tank(String color) {
        this.color = color;
        this.doors = getDoors();
        this.weight = getWeight();
    }

    public Tank(int doors, String color) {
        this.doors = doors;
        this.color = color;
        this.weight = getWeight();
    }

    public Tank(int doors, int weight) {
        this.doors = doors;
        this.weight = weight;
        this.color = getColor();
    }

    public void honk() {
        System.out.println("бабах москаля");
    }

}