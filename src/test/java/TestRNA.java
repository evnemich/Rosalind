import org.junit.Test;
import tools.Helpful;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/8/2016.
 */
public class TestRNA {
    @Test
    public void simpleTest() throws Exception {
        String in = "GATGGAACTTGACTACGTAAATT";
        String expected = "GAUGGAACUUGACUACGUAAAUU";
        String actual = RNA.doWork(in);

        assertThat(actual, is(expected));

        in = Helpful.readSingleStringFile("C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_revc.txt");
        System.out.println(RNA.doWork(in));
    }
}
