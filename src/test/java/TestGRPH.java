import org.junit.Test;
import tools.Tools;
import tools.Sequence;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static tools.Tools.getName;

/**
 * Created by Evgenii_Nemich on 8/11/2016.
 */
public class TestGRPH {
    @Test
    public void simpleTest() throws Exception {
        String file = getName("grph", 0);

        List<Sequence> input = Tools.readSequences(file);
        String[] expected = {"Rosalind_0498 Rosalind_2391",
                "Rosalind_0498 Rosalind_0442",
                "Rosalind_2391 Rosalind_2323"};
        String actual = GRPH.doWork(input, 3);

        System.out.println(actual);

        for (int i = 0; i < expected.length; i++) {
            assertThat(actual, containsString(expected[i]));
        }
    }

    @Test
    public void run() throws IOException {
        String file;
        List<Sequence> input;
        String actual;
        int attempt = 16;

        file = getName("grph", attempt);
        input = Tools.readSequences(file);
        actual = GRPH.doWork(input, 3);
        Tools.putAnswer("grph", attempt, actual);
        System.out.println(actual);
    }
}
