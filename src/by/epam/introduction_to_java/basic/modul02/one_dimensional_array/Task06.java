package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;

import java.util.Arrays;

/*
Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми
 */
public class Task06 {

    static double[] d = {-5, -7, 0, 2, 3.7, 9, -0.0, 24.22, -2, -18, 13, 17.86, 16};

    public static double processing(double[] d) {
        System.out.println();
        boolean[] simpleNumber = new boolean[d.length+1];
        double sum = 0;

        Arrays.fill(simpleNumber, true);
        simpleNumber[0] = false;
        simpleNumber[1] = false;

        for(int i = 2; i < simpleNumber.length; i++){
            if(simpleNumber[i]){
                for(int j = 2; j * i < simpleNumber.length; j++){
                    simpleNumber[i*j] = false;
                }
            }
        }

        for (int i = 0; i < d.length; i++) {
            if (simpleNumber[i])
                sum += d[i];
        }
        System.out.println(sum);
        return sum;
    }
}