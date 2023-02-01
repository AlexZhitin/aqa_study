package Basic.L3_hw2;

public class BadPupil extends Pupil {

    @Override
    void read() {
        System.out.println("Плохо читает");
    }

    @Override
    void write() {
        System.out.println("Плохо пишет");
    }

    @Override
    void study() {
        System.out.println("Плохо учится");
    }

    @Override
    void relax() {
        System.out.println("Плохо отдыхает");
    }
}