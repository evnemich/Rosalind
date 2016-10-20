import tools.Tools;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class PROT {
    public static String doWork(String input) {
        String result = "";
        Map<String, String> db;
        try {
            db = Tools.readRNACodonTable("C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_rna_codon_table.txt");
            for (int i = 0; i < input.length(); i += 3) {
                String substring = input.substring(i, i + 3);
                if (db.get(substring).equals("Stop"))
                    break;
                result += db.get(substring);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
