package Basic.L4_hw1;

import java.util.InputMismatchException;

public abstract class AbstractHandler {

    protected abstract void open();

    protected abstract void create();

    protected abstract void change();

    protected abstract void save();

    public AbstractHandler getDocObject(String format) {

        switch (format) {
            case "doc":
                return new DOCHandler();
            case "txt":
                return new TXTHandler();
            case "xml":
                return new XMLHandler();
            default:
                System.out.println("Wrong doc format");
                break;
        }

        return new AbstractHandler() {
            @Override
            protected void open() {

            }

            @Override
            protected void create() {

            }

            @Override
            protected void change() {

            }

            @Override
            protected void save() {

            }
        };
    }
}