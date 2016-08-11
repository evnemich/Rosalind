/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class FIB {
    private static long getFIB(int start, int prod, int generation) {
        long prev = start;
        long now = start;
        for (int i = 3; i <= generation; i++) {
            long temp = prev * prod + now;
            prev = now;
            now = temp;
        }
        return now;
    }

    public static long doWork(Integer gen, Integer start, Integer prod) {
        return getFIB(start, prod, gen);
    }
}
