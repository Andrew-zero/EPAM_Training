package by.epam.introduction_to_java.basic.modul02.decomposition;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
11.	Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {

    static int x = 2341234;
    static int y = 41234;

    public static void isMoreNumbers(int a, int b) {
        int countOne;
        int countTwo;

        countOne = countNumber(a);
        countTwo = countNumber(b);

        if (countOne > countTwo) {
            ViewHelper.helpViewResult("Количество цифр больше в числе " + a);
        } else if (countOne < countTwo) {
            ViewHelper.helpViewResult("Количество цифр больше в числе " + b);
        } else {
            ViewHelper.helpViewResult("Одинаковое количество цифр");
        }
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
