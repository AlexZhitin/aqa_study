package Basic.L6_hw1;

/*
Создайте класс FileReader у которого есть метод который возвращает текст из файла JavaHistory.rtf Переберите содержимое текста с помощью Stream Api
 и выведите на экран следующее:
- Количество только! слов в тексте (без цифр, пробелов и прочего) ~362
- Вывести слова которые начинаются с буквы “с“ независимо от регистра и их количество
- Количество пробелов
- Вывести всего 12 слов
- Отсортировать 12 слов
- Найти любое слово (тут надо  try...)
- Найти первое слово (тут надо  try...)
- Нйти последнее слово
- Вывести все цифры
- Узнать содержится ли 2006 год в тексте
- Вывести 30 уникальных слов (не повторяющихся)
* */

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader();

        System.out.println(reader.countWords());
        System.out.println("Count of words starting with \"c\": " + reader.wordsStartWithLetter("c").size());
        reader.wordsStartWithLetter("c").forEach(System.out::println);
        System.out.println("Count of spaces: " + reader.countSpaces().size());
        reader.printGivenNumberOfWords(12).forEach(System.out::println);
        reader.printGivenNumberOfWordsSorted(12).forEach(System.out::println);



// Do not remove
//        long countWords = reader.getText(fileLocation)
//                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
//                .filter(x -> !x.matches("\\p{Punct}|\\d+"))
//                .count();
//        System.out.println("Count of words: " + countWords);

// Do not remove
//        List<String> list = reader.getText(fileLocation)
//                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
//                .filter(x -> x.toLowerCase().startsWith("c"))
//                .collect(Collectors.toList());
//
//        list.forEach(System.out::println);
//        System.out.println("Count of words starting with \"C\": " + list.size());


// Do not remove
//       List<String> list2 = reader.getText(fileLocation)
//                .flatMap(line -> Stream.of(line.split("\\p{Punct}|\\w")))
//                .filter(x -> x.contains(" "))
//                .collect(Collectors.toList());
//
//        System.out.println(list2.size());
    }
}
