import org.junit.Test;
import tools.Helpful;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/11/2016.
 */
public class TestFIBD {
    @Test
    public void simpleTest() throws Exception {
        boolean ready = true;
        String file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_fibd.txt";

        List<Integer> input = Helpful.readIntegers(file, 2);
        long expected = 4;
        long actual = FIBD.doWork(input.get(0), 1, input.get(1));

        for (int i = 0; i <= 6; i++) {
            System.out.println(FIBD.doWork(i, 1, input.get(1)));
        }

        assertThat(actual, is(expected));

        if (ready) {
            file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_fibd(1).txt";
            input = Helpful.readIntegers(file, 2);
            System.out.println(FIBD.doWork(input.get(0), 1, input.get(1)));
        }
    }
}
