import java.io.File;
import java.nio.file.Files;

public class score {
    public static void main(String [] args) throws Exception {
        final File out = new File("./out");
        for (final File file : out.listFiles()) {
            System.out.println("\n" + file.getName());
            Files.lines(file.toPath())
                    .map(s -> s.trim())
                    .filter(s -> !s.isEmpty())
                    .forEach(System.out::println);
        }
    }
}
