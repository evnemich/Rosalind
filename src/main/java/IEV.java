import java.util.List;

public class IEV {
    public static double doWork(List<Integer> input, int offspringCount) {
        double AA = 0;
        double Aa = 0;
        double aa = 0;

        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0: // AA-AA
                    AA += input.get(i) * offspringCount;
                    break;
                case 1: // AA-Aa
                    AA += (double) (input.get(i) * offspringCount) / 2;
                    Aa += (double) (input.get(i) * offspringCount) / 2;
                    break;
                case 2: // AA-aa
                    Aa += input.get(i) * offspringCount;
                    break;
                case 3: // Aa-Aa
                    AA += (double) (input.get(i) * offspringCount) / 4;
                    Aa += (double) (input.get(i) * offspringCount) / 2;
                    aa += (double) (input.get(i) * offspringCount) / 4;
                    break;
                case 4: // Aa-aa
                    Aa += (double) (input.get(i) * offspringCount) / 2;
                    aa += (double) (input.get(i) * offspringCount) / 2;
                    break;
                case 5: // aa-aa
                    aa += input.get(i) * offspringCount;
            }
        }

        return AA + Aa;
    }
}
