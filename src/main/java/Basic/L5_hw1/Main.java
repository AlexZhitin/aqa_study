package Basic.L5_hw1;

/*Создать класс Animal с полями type и name
Cоздать класс Zoo. В классе создать конструктор который принимает список животных.
Создать методы для добавления нового животного addAnimal(String name, String type),  удаления животного по его name deleteAnimal(String animalName) и метод для вывода всего зоопарка в консоль.

Создать метод который выводит отсортированый список животных в формате {type, name}*/

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo(new ArrayList<>());
        zoo1.addAnimal("Alex", "Lion");
        zoo1.addAnimal("Jeff", "Giraffe");
        zoo1.addAnimal("Ted", "Elephant");

        zoo1.printAnimals();

        System.out.println("___________");

        System.out.println("Sorted in TreeMap:");
        for (Map.Entry<String, String> animalEntry : zoo1.treeMapAnimals().entrySet()) {
            System.out.println(animalEntry.getKey() + ", " + animalEntry.getValue());
        }

        System.out.println("___________After deletion by name:");
        zoo1.deleteAnimal("Ted");
        zoo1.printAnimals();

        System.out.println("__________________________________________________");

        Zoo zoo2 = new Zoo(new Animal("Mark", "Stork"), new Animal("Zhora", "Beaver"), new Animal("Pedro", "Dog"), new Animal("Ann", "Ape"));

        System.out.println("Sorted by type with comparator");
        zoo2.getAnimals().sort(new ComparatorByType());
        for (Animal tmp : zoo2.getAnimals()) {
            System.out.println(tmp);
        }
    }
}