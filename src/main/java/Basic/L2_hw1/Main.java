package Basic.L2_hw1;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = new Car(10);

        Car car3 = new Car(15, "green");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
