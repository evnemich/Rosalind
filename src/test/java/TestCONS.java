import org.junit.Test;
import tools.Tools;
import tools.Sequence;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/11/2016.
 */
public class TestCONS {
    @Test
    public void simpleTest() throws Exception {
        boolean ready = true;
        String file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_cons.txt";

        List<Sequence> input = Tools.readSequences(file);
        String expected = "ATGCAACT\n" +
                "A: 5 1 0 0 5 5 0 0\n" +
                "C: 0 0 1 4 2 0 6 1\n" +
                "G: 1 1 6 3 0 1 0 0\n" +
                "T: 1 5 0 0 0 1 1 6";
        String actual = CONS.doWork(input);

        assertThat(actual, is(expected));

        if (ready) {
            file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_cons(1).txt";
            input = Tools.readSequences(file);
            System.out.println(CONS.doWork(input));
        }
    }
}
