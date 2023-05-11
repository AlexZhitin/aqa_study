package Basic.L6_hw2;

// Создайте класс Book с полями name и writer.
// Создать библиотеку состоящею из n книг (количество книг в библиотеке определяет пользователь.
// Подсказка используйте библеотеку Faker для наполнения книги значением.
// Вывидете на экран содержимое библиотеки в формате Map состоящая из параметров name и writer

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<>());
        library.addBooks(5);

        for (Map.Entry<String, String> libraryEntry : library.booksToMap().entrySet()) {
            System.out.println( "\"" + libraryEntry.getKey() +"\"" + " by " + libraryEntry.getValue());
        }
    }
}