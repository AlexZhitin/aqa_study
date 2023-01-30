package Basic.L3_hw1;

public class ANSI {

    static String randomColor() {
        int a = (int) Math.floor(Math.random() * (7 + 1) + 0);
        return "\u001B[3" + a + "m";
    }
}