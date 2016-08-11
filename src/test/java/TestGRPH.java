import org.junit.Test;
import tools.Helpful;
import tools.Sequence;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/11/2016.
 */
public class TestGRPH {
    @Test
    public void simpleTest() throws Exception {
        boolean ready = false;
        String file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_grph.txt";

        List<Sequence> input = Helpful.readSequences(file);
        String expected = "Rosalind_0498 Rosalind_2391\n" +
                "Rosalind_0498 Rosalind_0442\n" +
                "Rosalind_2391 Rosalind_2323";
        String actual = GRPH.doWork(input);

        assertThat(actual, is(expected));

        if (ready) {
            file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_grph(1).txt";
            input = Helpful.readSequences(file);
            System.out.println(GRPH.doWork(input));
        }
    }
}
