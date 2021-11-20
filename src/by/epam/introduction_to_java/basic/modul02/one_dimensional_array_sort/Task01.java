package by.epam.introduction_to_java.basic.modul02.one_dimensional_array_sort;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого,
при этом не используя дополнительный массив.

!!!Так как массив является Immutable, не возможно увеличить его размер.
!!!Возможно внутреннее устройство потока обеспечит заданное условие, не использовать дополнительный массив.
 */
public class Task01 {

    static double[] array = {1, 2, 3, 4, 5};
    static double[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static double[] concatArrayStream(double[] array, double[] array2, int k) {
        if (array.length < k)
            throw new NumberFormatException();

        double[] resultArray = DoubleStream.concat(DoubleStream.concat(Arrays.stream(array, 0, k + 1), Arrays.stream(array2, 0, array2.length)),
                Arrays.stream(array, k + 1, array.length)).toArray();

        ViewHelper.ViewHelperArray(resultArray);

        return resultArray;
    }

    public static double[] concatArrayCopyOf(double[] array, double[] array2, int k) {

        if (array.length < k)
            throw new NumberFormatException();

        double temp = 0;

        array = Arrays.copyOf(array, array.length + array2.length);

        for (int i = 0; i < array2.length; i++) {
            array[k + 1 + i] = array2[i];
        }

        for (int i = k + array2.length + 1, index = 0; i < array.length; i++, index++) {
            array[i] = array2[index];
        }

        ViewHelper.ViewHelperArray(array);

        return array;
    }

    public static double[] concatArrayTraditional(double[] array, double[] array2, int k) {
        if (array.length < k)
            throw new NumberFormatException();

        int newLength = array.length + array2.length;

        double[] resultArray = new double[newLength];

        for (int i = k + 1, index = 0; index < array2.length; i++, index++) {
            resultArray[i] = array2[index];
        }

        for (int i = k + 1 + array2.length, index = k + 1; i < resultArray.length; i++, index++) {
            resultArray[i] = array[index];
        }

        ViewHelper.ViewHelperArray(resultArray);

        return resultArray;
    }
}
