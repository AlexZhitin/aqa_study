package Basic.L4_hw1;

public class XMLHandler extends AbstractHandler {
    @Override
    protected void open() {
        System.out.println("Open XML");

    }

    @Override
    protected void create() {
        System.out.println("Create XML");
    }

    @Override
    protected void change() {
        System.out.println("Change XML");
    }

    @Override
    protected void save() {
        System.out.println("Save XML");
    }
}