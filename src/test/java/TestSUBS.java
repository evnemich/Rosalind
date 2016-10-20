import org.junit.Test;
import tools.Tools;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/9/2016.
 */
public class TestSUBS {
    @Test
    public void simpleTest() throws Exception {
        String in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_subs.txt";
        List<String> strings = Tools.readMultipleStringFile(in);
        String expected = "2 4 10 ";
        String actual = SUBS.doWork(strings);

        assertThat(actual, is(expected));

        in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_subs(2).txt";
        strings = Tools.readMultipleStringFile(in);
        System.out.println(SUBS.doWork(strings));
    }
}
