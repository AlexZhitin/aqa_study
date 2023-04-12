package Basic.L6_hw1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    private String fileLocation;

    public FileReader(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    Stream<String> getText(String fileLocation) throws IOException {
        return Files.lines(Paths.get(fileLocation));
    }

    long countWords(FileReader reader) throws IOException {
        return reader.getText(getFileLocation())
                .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")))
                .filter(x -> !x.matches("\\p{Punct}|\\d+"))
                .count();
    }
}