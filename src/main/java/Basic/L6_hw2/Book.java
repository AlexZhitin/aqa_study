package Basic.L6_hw2;

public class Book {

    private final String name;
    private final String writer;

    protected Book(String name, String writer) {
        this.name = name;
        this.writer = writer;
    }

    protected String getName() {
        return name;
    }

    protected String getWriter() {
        return writer;
    }
}