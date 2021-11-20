package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;

/*
Даны действительные числа а1, а2, ...., аn.
Поменять местами наибольший и наименьший элементы.
 */

public class Task04 {

    static double[] d = {-5, -7, 0, 2, 3.7, 9, -0.0};

    public static double[] processing(double[] d) {
        double min = d[0];
        double max = d[0];
        int index = 0;
        int index2 = 0;


        for (int i = 0; i < d.length; i++) {
            if (min > d[i]) {
                min = d[i];
                index = i;
            }
            if (max < d[i]) {
                max = d[i];
                index2 = i;
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("index " + index);
        System.out.println("index2 " + index2);

        for (double d1 : d)
            System.out.print(d1 + " ");

        d[index] = max;
        d[index2] = min;

        System.out.println();
        for (double d1 : d)
            System.out.print(d1 + " ");

        return d;
    }
}
