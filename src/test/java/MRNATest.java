import org.junit.Test;
import tools.Tools;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MRNATest {
    @Test
    public void simpleTest() throws Exception {
        String input = "MA";
        int output = MRNA.doWork(input);
        int expected = 12;
        assertThat(output, is(expected));
        System.out.println(output);
    }

    @Test
    public void runTest() throws Exception {
        String input = Tools.readSingleStringFile(Tools.getName("MRNA", 3));
        int output = MRNA.doWork(input);
        System.out.println(output);
    }
}