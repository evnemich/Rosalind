import org.junit.Test;
import tools.Tools;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class TestIPRB {
    @Test
    public void name() throws Exception {
        String file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_iprb.txt";
        List<Integer> input = Tools.readIntegers(file, 3);
        String expected = "0.78333";

        double actual = IPRB.doWork(input.get(0), input.get(1), input.get(2));

        assertThat(String.format("%.5f", actual), is(expected));

        file = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_iprb(1).txt";
        input = Tools.readIntegers(file, 3);
        System.out.println(IPRB.doWork(input.get(0), input.get(1), input.get(2)));
    }
}
