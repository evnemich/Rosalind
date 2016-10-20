import org.junit.Test;
import tools.Tools;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/8/2016.
 */
public class TestREVC {
    @Test
    public void simpleTest() throws Exception {
        String in = "AAAACCCGGT";
        String expected = "ACCGGGTTTT";
        String actual = REVC.doWork(in);

        assertThat(actual, is(expected));

        in = Tools.readSingleStringFile("C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_revc(1).txt");
        System.out.println(REVC.doWork(in));
    }
}
