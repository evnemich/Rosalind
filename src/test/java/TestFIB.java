import org.junit.Test;
import tools.Helpful;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class TestFIB {
    @Test
    public void simpleTest() throws Exception {
        String in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_fib.txt";
        long expected = 19;
        List<Integer> input = Helpful.readIntegers(in, 2);
        long actual = FIB.doWork(input.get(0), 1, input.get(1));

        assertThat(actual, is(expected));


        in = "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_fib(2).txt";
        input = Helpful.readIntegers(in, 2);
        System.out.println(FIB.doWork(input.get(0), 1, input.get(1)));
    }
}
