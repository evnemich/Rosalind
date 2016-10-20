import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PERMTest {
    @Test
    public void simpleTest() throws Exception {
        int input = 3;
        String expected = "6\n" +
                "1 2 3\n" +
                "1 3 2\n" +
                "2 1 3\n" +
                "2 3 1\n" +
                "3 1 2\n" +
                "3 2 1";
        String actual = PERM.doWork(input);

        assertThat(actual, is(expected));

    }
}