package Basic.Car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = new Car(5);
        car2.setAge(10);

        Car car3 = new Car(10, "yellow");
        car3.setAge(15);
        car3.setColor("orange");

        System.out.println("Age: " + car1.getAge() + "; Color: " + car1.getColor());
        System.out.println("Age: " + car2.getAge());
        System.out.println("Age: " + car3.getAge() + "; Color: " + car3.getColor());
    }
}
