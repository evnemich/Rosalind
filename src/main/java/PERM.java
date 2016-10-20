import tools.Tools;

import java.util.ArrayList;
import java.util.List;

public class PERM {
    public static String doWork(int input) {
        String result = "" + (int)Tools.faktorial(((double) input));
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            arr.add(i);
        }
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                result += "\n";
                for (int k = 0; k < arr.size(); k++) {
                    result += arr.get(k);
                    if (k != arr.size() - 1)
                        result += " ";
                }
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        return result;
    }
}
