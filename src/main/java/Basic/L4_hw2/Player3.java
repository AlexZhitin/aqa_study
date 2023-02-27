package Basic.L4_hw2;

public class Player3 implements Playable {

    @Override
    public void play() {
        System.out.println("Проигрывание в Player3");
    }

    @Override
    public void pause() {
        System.out.println("Пауза в Player3");
    }

    @Override
    public void stop() {
        System.out.println("Стоп в Player3");
    }
}