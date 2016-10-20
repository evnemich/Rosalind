import tools.Tools;

import java.util.List;

import static tools.Tools.c;

public class LIA {

    enum Gen {AABB, AABb, AAbb, AaBB, AaBb, Aabb, aaBB, aaBb, aabb}

    public static double doWork(List<Integer> params) {
        // Aa Bb
        double one = 1;
        double[][] probabilities = {
                {one / 4,  one / 4, 0,        one / 4,  one / 4,  0,        0,         0,        0        },
                {one / 8,  one / 4, one / 8,  one / 8,  one / 4,  one / 8,  0,         0,        0        },
                {0,        one / 4, one / 4,  0,        one / 4,  one / 4,  0,         0,        0        },
                {one / 8,  one / 8, 0,        one / 4,  one / 4,  0,        one / 8,   one / 8,  0        },
                {one / 16, one / 8, one / 16, one / 8,  one / 4,  one / 8,  one / 16,  one / 8,  one / 16 },
                {0,        one / 8, one / 8,  0,        one / 4,  one / 4,  0,         one / 8,  one / 8  },
                {0,        0,       0,        one / 4,  one / 4,  0,        one / 4,   one / 4,  0        },
                {0,        0,       0,        one / 8,  one / 4,  one / 8,  one / 8,   one / 4,  one / 8  },
                {0,        0,       0,        0,        one / 4,  one / 4,  0,         one / 4,  one / 4  }};

        int k = params.get(0);
        int n = params.get(1);

        double childsAmount = Math.pow(2, k);
        if (k > 7 || n > childsAmount)
            return -1;

        return p (n, (int) childsAmount, 0.25);
    }

    private static double p(int m, int n, double p) {
        double result = 0;
        for (int i = m; i <= n; i++) {
            System.out.println("C" + i + " " + n + "=" + c(i, n));
            result += c(i, n) * Math.pow(p, i) * Math.pow(1 - p, n - i);
        }
        return result;
    }


}
