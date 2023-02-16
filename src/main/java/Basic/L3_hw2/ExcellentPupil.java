package Basic.L3_hw2;

public class ExcellentPupil extends Pupil {
    @Override
    protected void study() {
        System.out.println("замечательно учится");
    }

    @Override
    protected void read() {
        System.out.println("замечательно читает");
    }

    @Override
    protected void write() {
        System.out.println("замечательно пишет");
    }

    @Override
    protected void relax() {
        System.out.println("замечательно отдыхает");
    }
}