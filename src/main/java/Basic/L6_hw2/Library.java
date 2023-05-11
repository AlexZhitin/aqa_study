package Basic.L6_hw2;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {

    Faker faker = new Faker();
    ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBooks(int number) {
        for (int i = 0; i < number; i++) {
            String name = faker.book().title();
            String writer = faker.book().author();
            Book newBook = new Book(name, writer);
            books.add(newBook);
        }
    }

    public Map<String, String> booksToMap() {
        return books.stream().collect(
                Collectors.toMap(Book::getName, Book::getWriter));
    }
}