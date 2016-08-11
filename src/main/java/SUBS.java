import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/9/2016.
 */
public class SUBS {
    public static String doWork(List<String> data) {
        String result = "";
        if (data.size() != 2)
            return "";
        String sequence = data.get(0);
        String subSeq = data.get(1);
        int pos = sequence.length();

        for(pos = sequence.lastIndexOf(subSeq, pos); pos > 0; pos = sequence.lastIndexOf(subSeq, pos)) {
            result = (pos + 1) + " " + result;
            pos -= 1;
        }
        return result;
    }
}
