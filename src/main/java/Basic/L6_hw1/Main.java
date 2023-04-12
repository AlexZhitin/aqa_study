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
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileLocation = "/Users/o.zhytin/Projects/aqa_study/src/main/java/Basic/L6_hw1/JavaHistory.rtf";
        FileReader reader = new FileReader();

        long countWords = reader.getText(fileLocation)
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+"))
                .count();
        System.out.println("Count of words: " + countWords);


        List<String> list = reader.getText(fileLocation)
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> x.toLowerCase().startsWith("c"))
                .collect(Collectors.toList());

        list.forEach(System.out::println);
        System.out.println("Count of words starting with \"C\": " + list.size());



        List<String> list2 = reader.getText(fileLocation)
                .flatMap(line -> Stream.of(line.split("\\p{Punct}|\\w")))
                .filter(x -> x.contains(" "))
                .collect(Collectors.toList());

        System.out.println(list2.size());



    /*    List<String> list = words
                .map(s -> s.replaceAll("[^a-zA-Z ]", ""))
                .collect(Collectors.toList());


        list.forEach(System.out::print);
*/


        /*Stream<String> stream = reader.getText(fileLocation);
        List<String> list = stream
                .map(s -> s.replaceAll("[^a-zA-Z ]", ""))
                .collect(Collectors.toList());


        list.forEach(System.out::println);*/

    }
}
