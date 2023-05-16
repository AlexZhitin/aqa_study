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
    private String fileLocation;

    protected FileReader(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    protected String getFileLocation() {
        return fileLocation;
    }

    protected Stream<String> getText(String fileLocation) throws IOException {
        return Files.lines(Paths.get(fileLocation));
    }

    protected Stream<String> getFlatText(String fileLocation) throws IOException {
        return Files.lines(Paths.get(fileLocation))
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")));
    }

    protected long countWords() throws IOException {
        return getFlatText(getFileLocation())
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .count();
    }

    protected List<String> wordsStartWithLetter(String letter) throws IOException {
        return getFlatText(getFileLocation())
                .filter(x -> x.toLowerCase().startsWith(letter))
                .collect(Collectors.toList());
    }

    protected int wordsStartWithLetterCount(String letter) throws IOException {
        return wordsStartWithLetter(letter).size();
    }

    protected int countSpaces() throws IOException {
        return (int) getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("\\p{Punct}|\\w")))
                .filter(x -> x.contains(" ")).count();
    }

    protected Stream<String> getShuffledText() throws IOException {
        return getFlatText(getFileLocation())
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        collected -> {
                            Collections.shuffle(collected);
                            return collected.stream();
                        }));
    }

    protected List<String> printGivenNumberOfWords(int number) throws IOException {
        return getShuffledText()
                .limit(number)
                .collect(Collectors.toList());
    }

    protected List<String> printGivenNumberOfWordsSorted(int number) throws IOException {
        return printGivenNumberOfWords(number)
                .stream().sorted(Comparator.comparing(String::toLowerCase))
                .collect(Collectors.toList());
    }

    protected String findAnyWord() throws IOException {
        return getFlatText(getFileLocation())
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Nothing found"));
    }

    protected String findFirstWord() throws IOException {
        return getFlatText(getFileLocation())
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Nothing found"));
    }

    protected String findLastWord() throws IOException {
        return getFlatText(getFileLocation())
                .filter(x -> !x.matches("\\p{Punct}|\\d+|\\s"))
                .reduce((first, second) -> second)
                .orElseThrow(() -> new IllegalArgumentException("Nothing found"));
    }

    protected List<String> printAllNumbers() throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([,!?:;'\"-]|\\s)+")))
                .filter(x -> x.matches("^(?=.)([+-]?([0-9]*)(\\.([0-9]+))?)$"))
                .collect(Collectors.toList());
    }

    protected boolean findWordInText(String word) throws IOException {
        return getFlatText(getFileLocation())
                .anyMatch(word::equals);
    }

    protected List<String> printGivenNumberOfDistinctWords(int number) throws IOException {
        return getShuffledText()
                .distinct().limit(number)
                .collect(Collectors.toList());
    }
}