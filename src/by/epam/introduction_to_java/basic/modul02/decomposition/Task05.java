package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
5.	Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task05 {

    static double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static double secondMax(double[] array) {
        double max = maxNumber(array);
        double result = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > result && array[i] < max){
                result = array[i];
            }
        }

        ViewHelper.helpView(result);

        return result;
    }

    public static double maxNumber(double[] array) {
        double result = Double.MIN_VALUE;

        for (double d : array) {
            if (d > result) {
                result = d;
            }
        }

        return result;
    }

}
