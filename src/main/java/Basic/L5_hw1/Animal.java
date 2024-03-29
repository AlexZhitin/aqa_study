package Basic.L5_hw1;

public class Animal {
    private final String name;
    private final String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.type + ", " + this.name;
    }
}