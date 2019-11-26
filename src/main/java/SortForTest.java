import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SortForTest {
        List<String> lines;

    public SortForTest() throws IOException {
        lines = Files.readAllLines(Paths.get("src/Files/text.txt"), Charset.defaultCharset());
    }


    public void sortNatural() {
        System.out.println(Stream.of(lines.get(0)
                .split(","))
                .map(s -> Integer.parseInt(s))
                .sorted()
                .map(s -> String.valueOf(s)).
                        collect(Collectors.joining(" ")));
    }

    public void sortReverse() {
            System.out.println(Stream.of(lines.get(0)
                    .split(","))
                    .map(s -> Integer.parseInt(s))
                    .sorted(Comparator.reverseOrder())
                    .map(s -> String.valueOf(s)).
                            collect(Collectors.joining(" ")));
        }
}



