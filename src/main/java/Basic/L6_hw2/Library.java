package Basic.L6_hw2;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {

    Faker faker = new Faker();
    private final ArrayList<Book> books = new ArrayList<>();
    private final int number;

    protected Library(int number) {
        this.number = number;
        addBooks();
    }

    private void addBooks() {
        for (int i = 0; i < number; i++) {
            String name = faker.book().title();
            String writer = faker.book().author();
            Book newBook = new Book(name, writer);
            books.add(newBook);
        }
    }

    protected Map<String, String> getLibrary() {
        return books.stream().collect(
                Collectors.toMap(Book::getName, Book::getWriter));
    }
}