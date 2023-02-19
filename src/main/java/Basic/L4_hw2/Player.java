package Basic.L4_hw2;

public class Player implements Playable, Recordable {


    @Override
    public void play() {
        System.out.println("Проигрование");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }

    @Override
    public void record() {
        System.out.println("Запись");
    }
}