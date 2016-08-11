/**
 * Created by Evgenii_Nemich on 8/8/2016.
 */
public class REVC {
    public static String doWork(String data) {
        StringBuilder res = new StringBuilder();
        for (int i = data.length() - 1; i >= 0; i--) {
            switch(data.charAt(i)) {
                case 'A':
                    res.append('T');
                    break;
                case 'C':
                    res.append('G');
                    break;
                case 'G':
                    res.append('C');
                    break;
                case 'T':
                    res.append('A');
                    break;
            }
        }
        return res.toString();
    }
}
