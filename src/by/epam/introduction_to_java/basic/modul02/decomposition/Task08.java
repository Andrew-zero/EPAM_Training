package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
8.	Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.

 */
public class Task08 {

    static double[] array = {9, 5, 7, 0, 5, 6, 7, 8, 0};

    public static double sumOfThreeNumbers(double[] array, int fromIndex, int toIndex) {
        if (toIndex < fromIndex || toIndex < 0) {
            throw new IllegalArgumentException();
        }
        if(toIndex - fromIndex != 3){
            throw new IllegalArgumentException();
        }

        double result = 0;

        for (int i = fromIndex; i < toIndex; i++) {
            result += array[i];
        }

        ViewHelper.helpViewResult(result);

        return result;
    }

}
