package Basic.L5_hw1;

import java.util.Comparator;

public class ComparatorByType implements Comparator<Animal> {
    public int compare(Animal o1, Animal o2) {
        return o1.getType().compareTo(o2.getType());
    }
}