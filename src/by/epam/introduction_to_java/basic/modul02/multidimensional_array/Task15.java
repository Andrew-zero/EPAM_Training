package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Найдите наибольший элемент матрицы и замените все нечётные элементы на него.
 */
public class Task15 {

    static double[][] testArray = {{0, -8, 7, 4, 4, 5},
                                   {0, 1, 2, 3, 4, 5},
                                   {1, 1, -2, 3, 4, 5},
                                   {0, 1, 2, -3, 5, 4},
                                   {9, 1, 2, 2, 4, 5},
                                   {0, 1, 2, 3, 4, -5}};

    public static double[][] changeOddElementMatrix(double[][] array) {

        double maxElement = Double.MIN_VALUE;

        for (double[] d : array) {
            for (double k : d) {
                if (maxElement < k)
                    maxElement = k;
            }
        }

        for (double[] d : array) {
            for (int j = 0; j < array.length; j++) {
                if (d[j] % 2 != 0)
                    d[j] = maxElement;
            }
        }

        //View Matrix
        ViewHelper.helpViewArray(array);

        System.out.printf("max element = %.2f", maxElement);

        return array;
    }
}
