package Basic.L3_hw4.vehicles;

public class Tank extends Vehicle {

    public Tank(String color) {
        this.color = color;
        super.doors = getDoors();
        super.weight = getWeight();
    }

    public Tank(int doors, String color) {
        this.doors = doors;
        this.color = color;
        super.weight = getWeight();
    }

    public Tank(int doors, int weight) {
        this.doors = doors;
        this.weight = weight;
        super.color = getColor();
    }

    public void honk() {
        System.out.println("бабах москаля");
    }

}