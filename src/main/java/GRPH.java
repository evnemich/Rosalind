import tools.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class GRPH {
    public static String doWork(List<Sequence> input) {
        String res = "";
        for (Sequence seqOut : input) {
            for (Sequence seqIn : input) {
                if (!seqIn.equals(seqOut)) {
                    if (seqIn.getSequence().charAt(0) == seqOut.getSequence().charAt(seqOut.getSequence().length() - 1))
                        res += seqOut.getName() + " " + seqIn.getName() + "\n";
                }
            }
        }
        return res;
    }
}
