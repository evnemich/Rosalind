import tools.Sequence;

import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/9/2016.
 */
public class GC {
    private static double countGC(String seq) {
        int res = 0;
        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            if (c == 'G' || c == 'C')
                res++;
        }
        return (double)(res * 100) / seq.length();
    }

    public static String doWork(List<Sequence> in) {
        String res = "";
        double resData = 0;
        double error = 0.001;
        for (Sequence seq : in) {
            double gc = countGC(seq.getSequence());
            if (gc - resData > error) {
                res = seq.getName();
                resData = gc;
            }
        }
        res += "\n" + String.format("%.6f", resData);
        return res;
    }
}
