package Basic.L4_hw2;

public class Player2 implements Recordable {


    @Override
    public void pause() {
        System.out.println("Пауза в Player2");
    }

    @Override
    public void stop() {
        System.out.println("Стоп в Player2");
    }

    @Override
    public void record() {
        System.out.println("Запись в Player2");
    }
}