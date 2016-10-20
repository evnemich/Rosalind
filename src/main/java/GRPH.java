import tools.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class GRPH {
    public static String doWork(List<Sequence> input, int overlap) {
        String res = "";

        List<String> suffix = new ArrayList<>();
        List<String> prefix = new ArrayList<>();

        input.stream().map((s) -> s.getSequence()).forEach(s -> {
            prefix.add(s.substring(0, overlap));
            int length = s.length();
            suffix.add(s.substring(length - overlap, length));
        });

//        List<Pair<String, String>> graph = new ArrayList<>();

        for (int i = 0; i < prefix.size(); i++) {
            for (int j = 0; j < suffix.size(); j++) {
                if (i != j && prefix.get(i).equals(suffix.get(j))) {
//                    graph.add(new Pair<>(input.get(j).getName(), input.get(i).getName()));
                    res += input.get(j).getName() + " " + input.get(i).getName() + "\n";
                }
            }
        }


        return res;
    }
}
