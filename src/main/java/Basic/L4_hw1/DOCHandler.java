package Basic.L4_hw1;

public class DOCHandler extends AbstractHandler {

    @Override
    protected void open() {
        System.out.println("Open DOC");
    }

    @Override
    protected void create() {
        System.out.println("Create DOC");
    }

    @Override
    protected void change() {
        System.out.println("Change DOC");
    }

    @Override
    protected void save() {
        System.out.println("Save DOC");
    }
}