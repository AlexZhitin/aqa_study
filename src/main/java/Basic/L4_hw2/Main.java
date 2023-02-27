package Basic.L4_hw2;
//Создайте 2 интерфейса Playable и Recodable.
// В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//Написать программу, которая выполняет проигрывание и запись.

public class Main {
    public static void main(String[] args) {

        Player1 p1 = new Player1();
        p1.play();
        p1.record();
        p1.pause();
        p1.stop();

        System.out.println("____________________________");

        Player2 p2 = new Player2();
        p2.record();
        p2.pause();
        p2.stop();

        System.out.println("____________________________");


        Player3 p3 = new Player3();
        p3.play();
        p3.pause();
        p3.stop();
    }
}