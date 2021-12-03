package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
10.	Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */
public class Task10 {

    static int n = 1658414;

    public static int[] createArrayFromNumber(int n) {
        int length = countNumber(n);
        int[] arrayResult = new int[length];

        for (int i = 0; i < length; i++) {
            arrayResult[i] = n % 10;
            n /= 10;
        }

        ViewHelper.helpViewArray(arrayResult);

        return arrayResult;
    }

    public static int countNumber(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}
