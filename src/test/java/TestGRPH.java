import org.junit.Test;
import tools.Helpful;
import tools.Sequence;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static tools.Helpful.getName;

/**
 * Created by Evgenii_Nemich on 8/11/2016.
 */
public class TestGRPH {
    @Test
    public void simpleTest() throws Exception {
        boolean ready = true;
        String file = getName("grph", 0);

        List<Sequence> input = Helpful.readSequences(file);
        String expected = "Rosalind_0498 Rosalind_2391\n" +
                "Rosalind_0498 Rosalind_0442\n" +
                "Rosalind_2391 Rosalind_2323\n";
        String actual = GRPH.doWork(input);

        assertThat(actual, is(expected));

        if (ready) {
            file = getName("grph", 1);
            input = Helpful.readSequences(file);
            actual = GRPH.doWork(input);
            Helpful.printToFile(getName("grph", 1000), actual);
        }
    }
}
