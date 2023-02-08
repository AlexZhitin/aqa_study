package Basic.L3_hw4.main;
/*
Створити:
        - 2ві легкові автівки (жовтого та снього кольору з 2ма та 4ма дверима відповідно)
        - 1ну вантажівку
        - 3 танка
        - перший рожевий
        - другий чорний та з одними дверима
        - третій має 5 дверей та важить 30т
        Вивести на екран інформацію про кожен транспорт та звук який притаманний кожному виду транспорту відповідно(бип-бип, врум-врум, бабах москаля)
        Якщо параметри не введено то використати параметри за замовчуванням
        - 3е дверей
        - Білий колір
        - Вага 9т
*/

import Basic.L3_hw4.vehicles.Car;
import Basic.L3_hw4.vehicles.Tank;
import Basic.L3_hw4.vehicles.Truck;
import Basic.L3_hw4.vehicles.Vehicle;

public class Main {


    public static void main(String[] args) {
        System.out.println("____________________");
        Vehicle car1 = new Car(2, "yellow");
        Vehicle car2 = new Car(4, "blue");

        System.out.println(car1);
        System.out.println(car2);

        car1.honk();

        System.out.println("____________________");

        Vehicle truck = new Truck();

        System.out.println(truck);
        truck.honk();

        System.out.println("____________________");

        Vehicle tank1 = new Tank("pink");
        Vehicle tank2 = new Tank(1, "black");
        Vehicle tank3 = new Tank(5, 30);


        System.out.println(tank1);
        System.out.println(tank2);
        System.out.println(tank3);
        tank1.honk();
    }
}