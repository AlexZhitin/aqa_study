package Basic.L6_hw1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    private String fileLocation = "/Users/o.zhytin/Projects/aqa_study/src/main/java/Basic/L6_hw1/JavaHistory.rtf";

    public String getFileLocation() {
        return fileLocation;
    }

    Stream<String> getText(String fileLocation) throws IOException {
        return Files.lines(Paths.get(fileLocation));
    }

    long countWords() throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .count();
    }

    List<String> wordsStartWithLetter(String letter) throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> x.toLowerCase().startsWith(letter))
                .collect(Collectors.toList());
    }

    int wordsStartWithLetterCount(String letter) throws IOException {
        return wordsStartWithLetter(letter).size();
    }

    int countSpaces() throws IOException {
        return (int) getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("\\p{Punct}|\\w")))
                .filter(x -> x.contains(" ")).count();
    }

    List<String> printGivenNumberOfWords(int number) throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'()\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        collected -> {
                            Collections.shuffle(collected);
                            return collected.stream();
                        }))
                .limit(number)
                .collect(Collectors.toList());
    }

    List<String> printGivenNumberOfWordsSorted(int number) throws IOException {
        return printGivenNumberOfWords(number)
                .stream().sorted(Comparator.comparing(s -> s.toLowerCase()))
                .collect(Collectors.toList());
    }

    String findAnyWord() throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .findAny().orElse("Nothing found");
    }

    String findFirstWord() throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .findFirst().orElse("Nothing found");
    }

    String findLastWord() throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .reduce((first, second) -> second)
                .orElse(null);
    }

    List<String> printAllNumbers() throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([,!?:;'\"-]|\\s)+")))
                .filter(x -> x.matches("^(?=.)([+-]?([0-9]*)(\\.([0-9]+))?)$"))
                .collect(Collectors.toList());
    }

    boolean findWordInText(String word) throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .anyMatch(word::equals);
    }

    List<String> printGivenNumberOfDistinctWords(int number) throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'()/\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s+"))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        collected -> {
                            Collections.shuffle(collected);
                            return collected.stream().distinct();
                        }))
                .limit(number)
                .collect(Collectors.toList());
    }
}