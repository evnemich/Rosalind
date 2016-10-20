import org.junit.Assert;
import org.junit.Test;
import tools.Tools;
import tools.Tools.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MPRTTest {
    @Test
    public void simpleTest() throws Exception {
        List<String> input = Tools.readMultipleStringFile(Tools.getDefaultDir() + "MPRT_INPUT.txt");
        List<String> rightOutput = Tools.readMultipleStringFile(Tools.getDefaultDir() + "MPRT_OUTPUT.txt");
        List<String> output = MPRT.doWork(input);
        assertThat(output, is(rightOutput));
        System.out.println(output);
        System.out.println("\n\n");
        System.out.println(rightOutput);
    }

    @Test
    public void exactTest() throws Exception {
        List<String> input = Tools.readMultipleStringFile(Tools.getName("MPRT", 1));
        List<String> output = MPRT.doWork(input);
        for (String s : output) {
            System.out.println(s);
        }
    }
}