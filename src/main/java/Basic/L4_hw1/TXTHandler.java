package Basic.L4_hw1;

public class TXTHandler extends AbstractHandler {
    @Override
    protected void open() {
        System.out.println("Open TXT");

    }

    @Override
    protected void create() {
        System.out.println("Create TXT");
    }

    @Override
    protected void change() {
        System.out.println("Change TXT");
    }

    @Override
    protected void save() {
        System.out.println("Save TXT");
    }
}