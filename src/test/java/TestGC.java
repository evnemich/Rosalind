import org.junit.Test;
import tools.Helpful;
import tools.Sequence;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/9/2016.
 */
public class TestGC {
    @Test
    public void simpleTest() throws Exception {
        String in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_gc.txt";
        List<Sequence> sequences = Helpful.readSequences(in);
        String expected = "Rosalind_0808\n" +
                "60.919540";
        String actual = GC.doWork(sequences);

        assertThat(actual, is(expected));

        in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_gc(2).txt";
        sequences = Helpful.readSequences(in);
        System.out.println(GC.doWork(sequences));
    }
}
