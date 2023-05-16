package Basic.L5_hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Zoo {
    private final ArrayList<Animal> animals;

    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Zoo(Animal... animals) {
        this.animals = new ArrayList<>(Arrays.asList(animals));
    }

    public void addAnimal(String name, String type) {
        Animal newAnimal = new Animal(name, type);
        animals.add(newAnimal);
    }

    public void deleteAnimal(String name) {
        animals.removeIf(animal -> animal.getName().equals(name));
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getType());
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    TreeMap<String, String> treeMapAnimals() {
        TreeMap<String, String> allAnimals = new TreeMap<>();
        for (Animal a : getAnimals()) {
            allAnimals.put(a.getType(), a.getName());
        }
        return allAnimals;
    }
}