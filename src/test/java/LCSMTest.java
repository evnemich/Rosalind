import org.hamcrest.CoreMatchers;
import org.junit.Test;
import tools.Sequence;
import tools.Tools;

import java.util.List;

import static org.junit.Assert.assertThat;
import static tools.Tools.getName;

public class LCSMTest {
    @Test
    public void simpleTest() throws Exception {
        String file = getName("lcsm", 0);

        List<Sequence> input = Tools.readSequences(file);
        String actual = LCSM.doWork(input);

        System.out.println(actual);

        assertThat(actual, CoreMatchers.anyOf(
                CoreMatchers.containsString("AC"),
                CoreMatchers.containsString("TA"),
                CoreMatchers.containsString("CA")));
    }

    @Test
    public void run() throws Exception {

        String file;
        List<Sequence> input;
        String actual;
        int attempt = 2;
        file = getName("lcsm", attempt);
        input = Tools.readSequences(file);

        actual = LCSM.doWork(input);
        System.out.println(actual);
    }

}