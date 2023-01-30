package Basic.L3_hw1;

import static Basic.L3_hw1.ANSI.randomColor;

public class Derivative extends Printer {
    @Override
    void print(String value) {
        System.out.println(randomColor() + value);
    }
}