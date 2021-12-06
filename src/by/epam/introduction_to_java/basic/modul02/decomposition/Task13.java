package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

import java.util.Arrays;

/*
13.	Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */
public class Task13 {

    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

    public static void findTwins(int[] array, int n) {
        int simpleNumber1 = 0;
        int simpleNumber2 = 0;
        boolean isWrite1 = false;
        boolean isWrite2 = false;
        boolean[] simpleNumber = findSimpleNumber(array);

        for (int i = n; i <= 2 * n; i++) {
            if (simpleNumber[i] && !isWrite1) {
                simpleNumber1 = array[i - 1];
                isWrite1 = true;
            }

            if (simpleNumber[i] && !isWrite2) {
                simpleNumber2 = array[i - 1];
                isWrite2 = true;
            }

            if (isWrite1 && isWrite2) {
                if (simpleNumber2 - simpleNumber1 == 2) {
                    ViewHelper.helpViewResult("Two simple twins: " + simpleNumber1 + " " + simpleNumber2);
                }
                simpleNumber1 = simpleNumber2;
                isWrite2 = false;
            }
        }
    }


    public static boolean[] findSimpleNumber(int[] array) {
        boolean[] simpleNumber = new boolean[array.length];

        Arrays.fill(simpleNumber, true);
        simpleNumber[0] = false;
        simpleNumber[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (simpleNumber[i]) {
                for (int j = 2; j * i < array.length; j++) {
                    simpleNumber[i * j] = false;
                }
            }
        }

        return simpleNumber;
    }
}
