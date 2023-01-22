package Basic.L2_hw2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(10);
        Car car2 = new Car(20, 250);
        Car car3 = new Car(30, 270, 1999);
        Car car4 = new Car(40, 300, 3000, "white");

        System.out.println("Age: " + car.getAge() + "; Speed: " + car.getSpeed() + "; Weight: " + car.getWeight() + "; Color: " + car.getColor());
        System.out.println("Age: " + car1.getAge() + "; Speed: " + car1.getSpeed() + "; Weight: " + car1.getWeight() + "; Color: " + car1.getColor());
        System.out.println("Age: " + car2.getAge() + "; Speed: " + car2.getSpeed() + "; Weight: " + car2.getWeight() + "; Color: " + car2.getColor());
        System.out.println("Age: " + car3.getAge() + "; Speed: " + car3.getSpeed() + "; Weight: " + car3.getWeight() + "; Color: " + car3.getColor());
        System.out.println("Age: " + car4.getAge() + "; Speed: " + car4.getSpeed() + "; Weight: " + car4.getWeight() + "; Color: " + car4.getColor());

    }
}
