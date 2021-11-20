package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;


/*
Даны действительные числа а1, а2, ..., аn.
Найти: max(a1 + a2n, a2 + a2n-1, ... an + an+1)
 */
public class Task07 {


    public static double maxSum(double[] d) {
        double result = Double.MIN_VALUE;

        for (int i = 0; i < d.length / 2; i++) {
            if (result < d[i] + d[d.length - i - 1]) {
                result = d[i] + d[d.length - i - 1];
            }
        }
        if (d.length % 2 != 0) {
            if (result < d[d.length / 2] + d[(d.length / 2) + 1])
                result = d[d.length / 2] + d[(d.length / 2) + 1];
        }

        return result;
    }

}
