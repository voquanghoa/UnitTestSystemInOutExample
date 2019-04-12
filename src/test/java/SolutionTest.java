import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayOutputStream testOut = new ByteArrayOutputStream();

    @Before
    public void setUpOutput() {
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testCase1() {
        final String testString = "5\n" +
                "3 4 6 1 8";
        final String result = "Sum = 22, min = 1, max = 8";

        System.setIn(new ByteArrayInputStream(testString.getBytes()));

        Solution.main(new String[0]);

        assertEquals(result, testOut.toString());
    }

    @Test
    public void testCase2() {
        final String testString = "9\n" +
                "3 4 6 1 8 3 10 6 3";
        final String result = "Sum = 44, min = 1, max = 10";

        System.setIn(new ByteArrayInputStream(testString.getBytes()));

        Solution.main(new String[0]);

        assertEquals(result, testOut.toString());
    }
}
