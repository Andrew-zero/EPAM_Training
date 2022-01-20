package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
16.	Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.


 */
public class Task16 {


    public static long sumNumberFromOddDigit(int n) {
        int fromNumber = (int) Math.pow(10, n - 1);
        int toNumber = (int) Math.pow(10, n);
        long sum = 0;

        for (int i = fromNumber; i < toNumber; i++) {
            if (isEven(i)) {
                sum += i;
                ViewHelper.helpView(i);
            }
        }

        long numberEvenDigit = countEvenDigit(sum);
        ViewHelper.helpView(String.format("Сумма нечётных цифр = %d ", sum));
        ViewHelper.helpView(String.format("Чётных цифр в сумме %d - %d", sum, numberEvenDigit));

        return sum;
    }

    public static boolean isNumberFromOddDigit(int n) {
        int length = numberOfDigit(n);

        for (int i = 0; i < length; i++) {
            if (isEven(n % 10)) {
                return false;
            } else {
                n /= 10;
            }
        }

        return true;
    }

    public static int countEvenDigit(long n) {
        int length = numberOfDigit(n);
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (isEven(n % 10)) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    public static int numberOfDigit(long n) {

        return ("" + n).length();
    }

    public static boolean isEven(long n) {

        return n % 2 == 0;
    }
}
