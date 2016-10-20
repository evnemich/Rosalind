import org.junit.Test;
import tools.Tools;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class TestHAMM {
    @Test
    public void name() throws Exception {
        String in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_hamm.txt";
        List<String> strings = Tools.readMultipleStringFile(in);
        int expected = 7;

        int act = HAMM.doWork(strings.get(0), strings.get(1));
        assertThat(act, is(expected));

        in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_hamm(1).txt";
        strings = Tools.readMultipleStringFile(in);
        System.out.println(HAMM.doWork(strings.get(0), strings.get(1)));
    }
}
