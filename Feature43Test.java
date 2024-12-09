import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KiltonHalloweenFeatureTest {

    @Test
    public void testMainMethodOutput() {
        // Set up a stream to capture the output of System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save the original System.out
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        KiltonHalloweenFeature.main(null);

        // Restore the original System.out
        System.setOut(originalOut);

        // Expected output (ensure to match line breaks and spaces exactly)
        String expectedOutput = "Welcome to Kilton's
