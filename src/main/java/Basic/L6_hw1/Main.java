package Basic.L6_hw1;

/*
Создайте класс FileReader у которого есть метод который возвращает текст из файла JavaHistory.rtf Переберите содержимое текста с помощью Stream Api
 и выведите на экран следующее:
- Количество только! слов в тексте (без цифр, пробелов и прочего) ~362
- Вывести слова которые начинаются с буквы “с“ независимо от регистра и их количество
- Количество пробелов
- Вывести всего 12 слов
- Отсортировать 12 слов
- Найти любое слово
- Найти первое слово
- Нйти последнее слово
- Вывести все цифры
- Узнать содержится ли 2006 год в тексте
- Вывести 30 уникальных слов (не повторяющихся)
* */

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader();

//        System.out.println(reader.countWords());
//        System.out.println("Count of words starting with \"c\": " + reader.wordsStartWithLetterCount("c"));
//        reader.wordsStartWithLetter("c").forEach(System.out::println);
//        System.out.println("Count of spaces: " + reader.countSpaces());
//        reader.printGivenNumberOfWords(12).forEach(System.out::println);
//        reader.printGivenNumberOfWordsSorted(12).forEach(System.out::println);
//        System.out.println(reader.findAnyWord());
//        System.out.println(reader.findFirstWord());
//        System.out.println(reader.findLastWord());
//        reader.printAllNumbers().forEach(System.out::println);
//        System.out.println(reader.findWordInText("2006"));
        reader.printGivenNumberOfDistinctWords(10).forEach(System.out::println);
    }
}