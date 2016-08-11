import org.junit.Test;
import tools.Helpful;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class TestPROT {
    @Test
    public void name() throws Exception {
        String file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_prot.txt";

        String input = Helpful.readSingleStringFile(file);
        String expected = "MAMAPRTEINSTRING";
        String actual = PROT.doWork(input);

        System.out.println(input.length());
        System.out.println(expected.length());

        assertThat(actual, is(expected));

        file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_prot(1).txt";
        input = Helpful.readSingleStringFile(file);
        System.out.println(PROT.doWork(input));
    }
}
