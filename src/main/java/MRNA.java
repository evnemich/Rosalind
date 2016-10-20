import tools.Tools;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MRNA {
    public static int doWork(String input) {
        int result = 1;
        Map<String, Integer> variantsRNA = new HashMap<>();
        try {
            Map<String, String> tableRNA = Tools.readRNACodonTable(Tools.getDefaultDir() + "rosalind_rna_codon_table.txt");
            tableRNA.forEach((k,v) -> {
                Integer i = variantsRNA.putIfAbsent(v, 1);
                if (i != null)
                    variantsRNA.put(v, i + 1);
            });
            for (char c : input.toCharArray()) {
                result *= variantsRNA.get("" + c);
                result = (int) (result % 1e6);
            }
            result *= variantsRNA.get("Stop");
            result = (int) (result % 1e6);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
