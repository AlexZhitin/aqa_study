package Basic.L3_hw2;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("хорошо учится");
    }

    @Override
    void read() {
        System.out.println("хорошо читает");
    }

    @Override
    void write() {
        System.out.println("хорошо пишет");
    }

    @Override
    void relax() {
        System.out.println("хорошо отдыхает");
    }
}