package Basic.L3_hw2;

public class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("замечательно учится");
    }

    @Override
    void read() {
        System.out.println("замечательно читает");
    }

    @Override
    void write() {
        System.out.println("замечательно пишет");
    }

    @Override
    void relax() {
        System.out.println("замечательно отдыхает");
    }
}