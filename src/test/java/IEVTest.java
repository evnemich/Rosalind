import org.junit.Test;
import tools.Tools;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static tools.Tools.getName;

public class IEVTest {
    @Test
    public void simpleTest() throws Exception {
        Integer[] arr = {1, 0, 0, 1, 0, 1};
        List<Integer> input = Arrays.asList(arr);
        double expected = 3.5;
        double actual = IEV.doWork(input, 2);

        System.out.println(actual);

        assertThat(actual, is(expected));
    }

    @Test
    public void run() throws Exception {
        double actual;
        int attempt = 0;
        String file = getName("iev", attempt);
        List<Integer> input = Tools.readIntegers(file, 6);

        actual = IEV.doWork(input, 2);
        System.out.println(actual);
    }
}