/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class HAMM {
    public static int doWork(String firstSeq, String secSeq) {
        int s = 0;
        for (int i = 0; i < firstSeq.length(); i++) {
            if (firstSeq.charAt(i) != secSeq.charAt(i))
                s++;
        }
        return s;
    }
}
