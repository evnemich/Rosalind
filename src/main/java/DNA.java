/**
 * Created by Evgenii_Nemich on 8/8/2016.
 */
public class DNA {

    public static String doWork(String data) {
        int a = 0;
        int c = 0;
        int g = 0;
        int t = 0;
        for (int i = 0; i < data.length(); i++) {
            switch(data.charAt(i)) {
                case 'A':
                    a++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'G':
                    g++;
                    break;
                case 'T':
                    t++;
                    break;
            }
        }
        return a + " " + c + " " + g + " " + t;
    }
}
