package Basic.L3_hw2;

public class BadPupil extends Pupil {

    @Override
    protected void read() {
        System.out.println("Плохо читает");
    }

    @Override
    protected void write() {
        System.out.println("Плохо пишет");
    }

    @Override
    protected void study() {
        System.out.println("Плохо учится");
    }

    @Override
    protected void relax() {
        System.out.println("Плохо отдыхает");
    }
}