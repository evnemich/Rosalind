import tools.Motif;
import tools.Sequence;
import tools.Tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static tools.Tools.readSequences;

public class MPRT {
    // uniprot_sprot.fasta

    public static List<String> doWork(List<String> input) {
        List<Sequence> db = null;
        Motif motif = new Motif("N{P}[ST]{P}");
        List<String> result = new ArrayList<>();
        try {
            db = readSequences(Tools.getDefaultDir() + "uniprot_sprot.fasta");
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> inputCodes = input.stream()
                .map(x -> (x.split("_"))[0])
                .collect(Collectors.toList());

        for (int i = 0; i < inputCodes.size(); i++) {
            String seq = inputCodes.get(i);
            List<Sequence> sequences = db.stream().filter(x -> x.getName().contains(seq)).collect(Collectors.toList());
            List<Integer> locations;
            if (sequences.size() > 0) {
                locations = motif.findLocations(sequences.get(0));
                if (locations.size() > 0) {
                    result.add(input.get(i));
                    String s = "";
                    for (Integer location : locations) {
                        s += location + " ";
                    }
                    s = s.substring(0, s.length() - 1);
                    result.add(s);
                }
            }
        }
        return result;
    }
}
