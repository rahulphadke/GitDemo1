import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testMain() {
        // Redirecting output to capture it for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Call the main method of the App class
        App.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Check the output
        String output = outputStream.toString().trim();
        assertEquals("Hello, World!", output);
    }
}