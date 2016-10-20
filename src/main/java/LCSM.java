import tools.Sequence;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LCSM {
    public static String doWork(List<Sequence> input){
        List<String> seqs = input.stream().map(x -> x.getSequence()).collect(Collectors.toList());
        List<String> subs = new ArrayList<>();


        String firstSeq = seqs.get(0);
        String secondSeq = seqs.get(1);
        for (int i = 0; i < firstSeq.length(); i++) {
            for (int j = firstSeq.length(); j > i; j--) {
                String substring = firstSeq.substring(i, j);
                if (secondSeq.contains(substring)) {
                    subs.add(substring);
                }
            }
        }

        for (int s = 2; s < seqs.size(); s++) {
            for (int i = 0; i < subs.size(); i++) {
                if (!seqs.get(s).contains(subs.get(i))) {
                    subs.remove(subs.get(i));
                    continue;
                }
            }
        }

        String max = subs.get(0);
        for (String sub : subs) {
            if (max.length() < sub.length())
                max = sub;
        }

        return max;
    }
}
