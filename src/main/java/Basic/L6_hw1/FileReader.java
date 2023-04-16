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
                .filter(x -> !x.matches("\\p{Punct}|\\d+"))
                .count();
    }


    List<String> wordsStartWithLetter(String letter) throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> x.toLowerCase().startsWith(letter))
                .collect(Collectors.toList());
    }

    List<String> countSpaces() throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("\\p{Punct}|\\w")))
                .filter(x -> x.contains(" "))
                .collect(Collectors.toList());

    }

    List<String> printGivenNumberOfWords(int number) throws IOException {
        return getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+"))
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
}