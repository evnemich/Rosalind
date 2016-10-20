import org.junit.Test;
import tools.Tools;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/8/2016.
 */
public class TestDNA {

    @Test
    public void simpleTest() {
        String test_in = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        String expected = "20 12 17 21";

        assertThat(DNA.doWork(test_in), is(expected));

        try {
            test_in = Tools.readSingleStringFile("C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_dna(1).txt");
            System.out.println(DNA.doWork(test_in));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
