package Basic.L4_hw1;

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
                throw new IllegalArgumentException("Wrong doc format");
        }
    }
}