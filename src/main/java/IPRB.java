/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class IPRB {
    public static double doWork(Integer AA, Integer Aa, Integer aa) {
        int all = AA + Aa + aa;
        double prob1; // two parents aa         => 100%
        double prob2; // two parents Aa         => 25%
        double prob3; // two parents aa and Aa  => 50%

        prob1 = ((double)aa / all) * (aa - 1) / (all - 1);
        prob2 = ((double)Aa / all) * (Aa - 1) / (all - 1);
        prob3 = ((double)Aa / all) * aa / (all - 1) + ((double)aa / all) * Aa / (all - 1);

        return 1 - (prob1 + prob2 / 4 + prob3 / 2);
    }
}
