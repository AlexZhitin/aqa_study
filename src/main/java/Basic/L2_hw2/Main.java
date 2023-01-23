package Basic.L2_hw2;

/*Создать новый класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я. Перегрузить конструкторы.
Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.*/

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
