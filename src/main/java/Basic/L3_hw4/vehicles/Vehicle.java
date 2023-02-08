package Basic.L3_hw4.vehicles;

public abstract class Vehicle {

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " params: doors=" + doors +
                ", weight=" + weight +
                ", color='" + color + '\'';
    }

    protected int doors = 3;
    protected int weight = 9;
    protected String color = "white";

    public int getDoors() {
        return doors;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public abstract void honk();
}