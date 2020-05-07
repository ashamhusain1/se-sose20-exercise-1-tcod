package raytracer;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import static junit.framework.TestCase.assertTrue;

public class MainTest {
    private static String LOG_PATH = "./out/MainTest.md";
    private static StringBuilder STRING_BUILDER = new StringBuilder();
    private static int TOTAL_SCORE = 1;
    private static int SCORE;



    @AfterClass
    public static void afterClass() throws IOException {
        PrintWriter logFile = new PrintWriter(LOG_PATH, StandardCharsets.UTF_8);
        logFile.write("## Main.java: TEST SCORE (" + SCORE + "/" + TOTAL_SCORE + ")\n");
        logFile.write(STRING_BUILDER.toString());
        logFile.close();
    }


    @Rule
    public TestWatcher logger = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            STRING_BUILDER.append("- [x] ");
            if (description != null) {
                STRING_BUILDER.append(description);
            }
            if (e != null) {
                STRING_BUILDER.append(' ');
                STRING_BUILDER.append(e);
            }
            STRING_BUILDER.append(": TEST FAILED  [0]\n");
        }
        @Override
        protected void succeeded(Description description) {
            STRING_BUILDER.append("- [x] ");
            if (description != null) {
                STRING_BUILDER.append(description);
            }
            STRING_BUILDER.append(": TEST PASSED  [+1]\n");
            SCORE ++;
        }
    };


    @Test
    public void inheritanceTest() throws Exception {
        // If PrettyPrint Parser is not of base type raytracer.XMLParser, the assertion will fail!
        final Object PrettyPrintParser = new XMLParser("./res/foo.xml");
        assertTrue(PrettyPrintParser instanceof XMLParser);
    }
}

