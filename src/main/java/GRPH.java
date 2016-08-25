import tools.Pair;
import tools.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class GRPH {
    public static String doWork(List<Sequence> input, int overlap) {
        String res = "";

        List<Pair<String, String>> result = new ArrayList<>();
        List<Pair<String, String>> graph = new ArrayList<>();

        for (Sequence seqOut : input) {
            for (Sequence seqIn : input) {
                if (!seqIn.equals(seqOut)) {
                    for (int i = 0; i < overlap; i++) {
                        if (seqOut.getSequence().charAt(seqOut.getSequence().length() - overlap + i) != seqIn.getSequence().charAt(i)) {
                            break;
                        } else if (i == overlap - 1) {
                            graph.add(new Pair(seqOut.getName(), seqIn.getName()));
                        }
                    }
                }
            }
        }

        int i = 0;
        for (Pair<String, String> pair : graph) {
            if (pair.keysInValuesAmount(graph).size() == 0 || pair.valuesInKeysAmount(graph).size() == 0) {
                result.add(pair);
                i++;
                res += pair.getKey() + " " + pair.getValue() + "\n";
            }
        }

        return res;
    }
}
