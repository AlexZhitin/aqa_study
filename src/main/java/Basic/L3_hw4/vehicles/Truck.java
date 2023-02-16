package Basic.L3_hw4.vehicles;

public class Truck extends Vehicle {
    public Truck() {
        super();
    }

    @Override
    public void honk() {
        System.out.println("врум-врум");
    }
}