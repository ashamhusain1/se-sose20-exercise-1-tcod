package raytracer;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class XMLParserTest {

    private static String LOG_PATH = "./out/XMLParserTest.md";
    private static StringBuilder STRING_BUILDER = new StringBuilder();
    private static int TOTAL_SCORE = 3;
    private static int SCORE;


    @AfterClass
    public static void afterClass() throws IOException {
        PrintWriter logFile = new PrintWriter(LOG_PATH, StandardCharsets.UTF_8);
        logFile.write("## XMLParser.java: TEST SCORE (" + SCORE + "/" + TOTAL_SCORE + ")\n");
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


    /*
     * If expected methods do not exist,
     * an exception will be thrown to causing the test to fail!
     */

    @Test
    public void enterMemberTest() throws Exception {
        Method enter = XMLParser.class.getDeclaredMethod("enter", StartElement.class);
    }

    @Test
    public void exitMemberTest() throws Exception {
        Method exit = XMLParser.class.getDeclaredMethod("exit", EndElement.class);
    }

    @Test
    public void parseMemberTest() throws Exception {
        Method parse = XMLParser.class.getDeclaredMethod("parse");
    }
}

