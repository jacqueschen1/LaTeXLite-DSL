package Libraries;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class SaveLatex {
    public static void save(ArrayList<String>[] data, String path, String filename) throws IOException {
        Path file = Paths.get(path + filename + ".tex");
        for (List<String> array: data) {
            Files.write(file, array, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }
        System.out.println("Finished");
    }
}