import tools.Tools;
import tools.Sequence;

import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/11/2016.
 */
public class CONS {
    public static String doWork(List<Sequence> sequences) {
        String result = "";
        String resultA = "A:";
        String resultC = "C:";
        String resultG = "G:";
        String resultT = "T:";
        for (int i = 0; i < sequences.get(0).getSequence().length(); i++) {
            int a = 0;
            int c = 0;
            int g = 0;
            int t = 0;

            for (Sequence sequence : sequences) {
                switch (sequence.getSequence().charAt(i)) {
                    case 'A':
                        a++;
                        break;
                    case 'C':
                        c++;
                        break;
                    case 'G':
                        g++;
                        break;
                    case 'T':
                        t++;
                        break;
                }
            }

            result += Tools.getMaxChar(a, c, g, t);

            resultA += " " + a;
            resultC += " " + c;
            resultG += " " + g;
            resultT += " " + t;
        }
        result += "\n" + resultA
                + "\n" + resultC
                + "\n" + resultG
                + "\n" + resultT;
        return result;
    }
}
