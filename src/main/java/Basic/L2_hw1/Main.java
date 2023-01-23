package Basic.L2_hw1;

/*Создать класс Машина с полями год(int), цвет(String).
Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.*/

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
