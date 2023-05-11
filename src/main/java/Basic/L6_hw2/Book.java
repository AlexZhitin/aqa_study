package Basic.L6_hw2;

public class Book {

    private final String name;
    private final String writer;

    public Book(String name, String writer) {
        this.name = name;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }
}