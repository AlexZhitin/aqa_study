package Basic.L5_hw1;

/*Создать класс Animal с полями type и name
Cоздать класс Zoo. В классе создать конструктор который принимает список животных.
Создать методы для добавления нового животного addAnimal(String name, String type),  удаления животного по его name deleteAnimal(String animalName) и метод для вывода всего зоопарка в консоль.

Создать метод который выводит отсортированый список животных в формате {type, name}*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo(new ArrayList<>());
        zoo1.addAnimal("Alex", "Elephant");
        zoo1.addAnimal("Jeff", "Giraffe");
        zoo1.addAnimal("Ted", "Lion");

        System.out.println("__________________________________________________");
        zoo1.printAnimals();

        System.out.println("___");

        zoo1.deleteAnimal("Lion");
        zoo1.printAnimals();

        System.out.println("__________________________________________________");

        Zoo zoo2 = new Zoo(new Animal("Mark", "Stork"), new Animal("Zhora", "Beaver"), new Animal("Pedro", "Dog"));
        zoo2.printAnimals();

        System.out.println("___");

        zoo2.deleteAnimal("Pedro");
        zoo2.printAnimals();
    }
}