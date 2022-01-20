package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
15.	Найти все натуральные n-значные числа,
цифры в которых образуют строго возрастающую последовательность (например, 1234, 6789).
Для решения задачи использовать декомпозицию.
 */
public class Task15 {

    public static void allNaturalGrowingDigit(int n) {
        int fromNumber = (int) Math.pow(10, n - 1);
        int toNumber = (int) Math.pow(10, n);

        for (int i = fromNumber; i < toNumber; i++) {
            if (isGrowingDigit(i)) {
                ViewHelper.helpView(i);
            }
        }
    }

    public static boolean isGrowingDigit(int n) {
        int length = lengthNumber(n);
        int temp = n % 10;

        for (int i = 0; i < length - 1; i++) {
            n /= 10;
            int k = n % 10;
            if (temp > k && temp == k + 1) {
                temp = n % 10;
            } else {
                return false;
            }
        }

        return true;
    }

    public static int lengthNumber(int n) {

        return ("" + n).length();
    }
}
