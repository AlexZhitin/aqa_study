package Basic.L4_hw2;
//Создайте 2 интерфейса Playable и Recodable.
// В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//Написать программу, которая выполняет проигрывание и запись.

public class Main {
    public static void main(String[] args) {

        Playable play = new Player();

        play.play();
        play.pause();
        play.stop();

        Recordable record = new Player();

        record.record();
        record.pause();
        record.stop();
    }
}