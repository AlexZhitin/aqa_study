package Basic.L4_hw2;

public class Player1 implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("Проигрывание в Player1");
    }

    @Override
    public void pause() {
        System.out.println("Пауза в Player1");
    }

    @Override
    public void stop() {
        System.out.println("Стоп в Player1");
    }

    @Override
    public void record() {
        System.out.println("Запись в Player1");
    }
}