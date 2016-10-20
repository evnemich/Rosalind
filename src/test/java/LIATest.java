import org.junit.Assert;
import org.junit.Test;
import tools.Tools;

import java.util.List;

import static tools.Tools.getName;

public class LIATest {
    @Test
    public void simpleTest() throws Exception {
        String file = getName("lia", 0);

        List<Integer> input = Tools.readIntegers(file, 2);
        double actual = LIA.doWork(input);

        System.out.println(actual);

        double expected = 0.684;
        double delta = 0.001;
        Assert.assertEquals(actual, expected, delta);
    }

    @Test
    public void run() throws Exception {

        String file;
        int attempt = 2;
        file = getName("lia", attempt);
        List<Integer> input = Tools.readIntegers(file, 2);

        double actual = LIA.doWork(input);
        System.out.println(actual);
    }
}