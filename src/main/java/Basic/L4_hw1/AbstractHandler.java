package Basic.L4_hw1;

public abstract class AbstractHandler {

    abstract void open();

    abstract void create();

    abstract void change();

    abstract void save();

    static AbstractHandler getDocObject(String format) {
        if ("xml".equals(format))
            return new XMLHandler();
        else if ("doc".equals(format))
            return new DOCHandler();
        else if ("txt".equals(format))
            return new TXTHandler();
        else return null;
    }
}