package Basic.L3_hw2;

public class GoodPupil extends Pupil {
    @Override
    protected void study() {
        System.out.println("хорошо учится");
    }

    @Override
    protected void read() {
        System.out.println("хорошо читает");
    }

    @Override
    protected void write() {
        System.out.println("хорошо пишет");
    }

    @Override
    protected void relax() {
        System.out.println("хорошо отдыхает");
    }
}