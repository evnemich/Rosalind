import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/11/2016.
 */
public class FIBD {
    private static long getFIB(int start, int prod, int live, int generation) {
        List<Long> steps = new ArrayList<Long>();
        steps.add((long) start);
        steps.add((long) start);
        steps.add((long) start);

        for (int i = 3; i <= generation; i++) {
            steps.add(steps.get(i - 2) * prod + steps.get(i - 1) - (i > live ? steps.get(i - live - 1) * prod : 0));
        }
        return steps.get(steps.size() - 1);
    }

    public static long doWork(Integer gen, Integer start, Integer live) {
        return getFIB(start, 1, live, gen);
    }
}
