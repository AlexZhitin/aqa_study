package Basic.L6_hw1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    Stream <String> getText(String fileLocation) throws IOException {
        return Files.lines(Paths.get(fileLocation));
               /* .flatMap(line -> Stream.of(line.split("([.,!?:;'\"-]|\\s)+")));*/
    }
}