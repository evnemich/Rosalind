import tools.Sequence;

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

                    boolean equal = true;
                    for (int i = 0; i < seqOut.getSequence().length() / 2 || i < seqIn.getSequence().length() / 2; i++) {
                        if (seqOut.getSequence().charAt(seqOut.getSequence().length() - 1 - i) != seqIn.getSequence().charAt(i)) {
                            equal = false;
                            break;
                        }
                    }
                    if (equal) {
                        res += seqOut.getName() + " " + seqIn.getName() + "\n";
                    }

                }
            }
        }

        return res;
    }
}
