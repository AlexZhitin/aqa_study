package Basic.L2_hw2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(10);
        Car car2 = new Car(20, 250);
        Car car3 = new Car(30, 270, 1999);
        Car car4 = new Car(40, 300, 3000, "white");

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
