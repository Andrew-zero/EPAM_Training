package by.epam.introduction_to_java.basic.modul02.one_dimensional_array;


import java.util.Arrays;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task09 {

    public static int[] arrayTest = {0, 0, 0, 0, 2, 2, 2, 3, 4, 3, 0, 4, 4, 4, 5, 6, 2, 2};

    public static int oftenNumber(int[] array) {
        if (array.length == 0) {
            throw new NumberFormatException();
        }

        boolean[] booleanArray = new boolean[array.length];
        Arrays.fill(booleanArray, true);
        int maxCountResult = 0;
        int maxCountTemp;
        int numberResult = 0;
        int numberTemp;

        for (int i = 0; i < booleanArray.length; i++) {
            if (booleanArray[i]) {
                maxCountTemp = 0;
                numberTemp = array[i];
                maxCountTemp++;
                booleanArray[i] = false;
                for (int j = i + 1; j < booleanArray.length - 1; j++) {
                    if (booleanArray[j]) {
                        if (numberTemp == array[j]) {
                            booleanArray[j] = false;
                            maxCountTemp++;
                        }
                    }
                }
                if (maxCountResult < maxCountTemp) {
                    maxCountResult = maxCountTemp;
                    numberResult = numberTemp;
                } else if (maxCountResult == maxCountTemp) {
                    if (numberResult > numberTemp)
                        numberResult = numberTemp;
                }
            }
        }

        System.out.println(numberResult);
        return numberResult;
    }
}
